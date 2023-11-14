package br.com.targettrust.spring.aula.repository;

import br.com.targettrust.spring.aula.model.Pessoa;
import br.com.targettrust.spring.aula.model.error.NotFoundException;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@Primary
public class PessoaBancoSpringRepositoryAdapter implements PessoaRepository {

    private final PessoaSpringRepository repository;

    public PessoaBancoSpringRepositoryAdapter(PessoaSpringRepository repository) {
        this.repository = repository;
    }

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public List<Pessoa> listAll() {
        return repository.findAll();
    }

    @Override
    public void save(Pessoa pessoa) {
        repository.save(pessoa);
    }

    @Override
    public void editPessoa(Pessoa pessoaNova, Integer id) {
        Optional<Pessoa> pessoaExistente = repository.findById(id);

        if(pessoaExistente.isEmpty()) {
            throw new NotFoundException("Pessoa", id.toString());
        }

        pessoaNova.setId(id);

        repository.save(pessoaNova);
    }
}
