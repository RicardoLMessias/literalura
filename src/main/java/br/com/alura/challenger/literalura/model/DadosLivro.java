package br.com.alura.challenger.literalura.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosLivro (
//        int count,
//        String next,
//        String previous,
        List<Livro> results
){
}
