package br.com.alura.challenger.literalura.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosAutor(
        @JsonAlias ("name") String nome,
        @JsonAlias("birth_year") Integer nascimento,
        @JsonAlias("death_year") Integer falecimento
) {
}
