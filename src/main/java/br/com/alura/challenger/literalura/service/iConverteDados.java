package br.com.alura.challenger.literalura.service;

public interface iConverteDados {
   <T> T obterDados (String json , Class <T> classe);
}
