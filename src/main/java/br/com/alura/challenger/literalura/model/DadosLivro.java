package br.com.alura.challenger.literalura.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)

public record DadosLivro(
//        @Id
//        @GeneratedValue(strategy = GenerationType.IDENTITY)
        Long id,
//        @Column(unique = true)
        @JsonAlias("title") String titulo,
//        @Column(name = "Autor")
        List<DadosAutor> authors,
        @JsonAlias("languages")List<String> idioma,
        @JsonAlias("download_count") Integer downloads
)  {



}

