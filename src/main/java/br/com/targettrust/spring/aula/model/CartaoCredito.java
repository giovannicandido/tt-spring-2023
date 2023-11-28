package br.com.targettrust.spring.aula.model;

import jakarta.persistence.*;
import lombok.*;

/**
 * Olhar os comentários de {@link Endereco}
 */
@Entity
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CartaoCredito {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(nullable = false, unique = true)
    private String numero;
}
