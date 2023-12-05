package br.com.targettrust.spring.aula.controller.response;

import br.com.targettrust.spring.aula.model.unidade.Unidade;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UnidadeResponse {

    private Integer id;

    private String nome;

    public static UnidadeResponse of(Unidade unidade) {
        return UnidadeResponse.builder()
            .id(unidade.getId())
            .nome(unidade.getNome())
            .build();
    }
}
