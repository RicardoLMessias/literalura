package br.com.alura.challenger.literalura.principal;

import br.com.alura.challenger.literalura.model.DadosLivro;
import br.com.alura.challenger.literalura.service.ConsumoApi;
import br.com.alura.challenger.literalura.service.ConverteDados;

import java.util.Scanner;

public class Principal {
    private Scanner leitura = new Scanner(System.in);
    private final String ENDERECO = "http://gutendex.com/books/?search=";
    private ConsumoApi consumo = new ConsumoApi();

    private ConverteDados conversor = new ConverteDados();


    public void exibeMenu(){
        System.out.println("Digite o nome do livro para busca: ");
        var nomeLivro = leitura.nextLine();
        var json = consumo.obterDados(ENDERECO+ nomeLivro.replace(" ", "+"));


        DadosLivro dados = conversor.obterDados(json, DadosLivro.class);
        System.out.println(dados);

    }
}
