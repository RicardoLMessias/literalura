package br.com.alura.challenger.literalura.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Livro(int id,
                    @JsonAlias("title") String titulo,
                    List<Autor> authors,
//                    List<String> summaries,
//                    List<String> translators,
//                    List<String> subjects,
//                    List<String> bookshelves,
//                    List<String> languages,
//                    @JsonAlias("copyright") boolean possuiDireitoAutoral,
//                    @JsonAlias("media_type") String tipoMidia,
//                    Map<String, String> formats,
                    @JsonAlias("download_count") int downloads

)
{}

