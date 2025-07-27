package br.com.alura.challenger.literalura.model;

import com.fasterxml.jackson.annotation.JsonAlias;

import java.util.List;

public class Livro {

    private String tituloLivro;
    private List<DadosAutor> name;
    private List<String> idioma;
    private Integer downloads;

    public Livro(DadosLivro dadosLivro) {
        this.tituloLivro = dadosLivro.titulo();
        this.name = dadosLivro.authors();
        this.idioma = dadosLivro.idioma();
        this.downloads = dadosLivro.downloads();
    }

    public String getTituloLivro() {
        return tituloLivro;
    }

    public void setTituloLivro(String tituloLivro) {
        this.tituloLivro = tituloLivro;
    }

    public List<DadosAutor> getName() {
        return name;
    }

    public void setName(List<DadosAutor> name) {
        this.name = name;
    }

    public List<String> getIdioma() {
        return idioma;
    }

    public void setIdioma(List<String> idioma) {
        this.idioma = idioma;
    }

    public Integer getDownloads() {
        return downloads;
    }

    public void setDownloads(Integer downloads) {
        this.downloads = downloads;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "tituloLivro='" + tituloLivro + '\'' +
                ", name=" + name +
                ", idioma=" + idioma +
                ", downloads=" + downloads +
                '}';
    }
}
