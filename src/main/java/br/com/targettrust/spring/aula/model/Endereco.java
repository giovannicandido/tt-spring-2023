package br.com.targettrust.spring.aula.model;

import jakarta.persistence.*;

import java.util.Collection;

@Entity
@SequenceGenerator(name = "endereco_generator", sequenceName = "endereco_sequence")
public class Endereco {
    @Id
    @GeneratedValue(generator = "endereco_generator" ,strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "rua", length = 40, nullable = false)
    private String logradouro;

    @Column(length = 40, nullable = false)
    private String bairro;

    @Column(nullable = false)
    private Integer numero;

    @Column(nullable = false, length = 50)
    private String cidade;

    @Column(nullable = false, length = 2)
    @Enumerated(EnumType.STRING)
    private Estado estado;

    @Column(length = 16)
    private String cep;

    @ManyToOne
    private Pessoa pessoa;

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
}