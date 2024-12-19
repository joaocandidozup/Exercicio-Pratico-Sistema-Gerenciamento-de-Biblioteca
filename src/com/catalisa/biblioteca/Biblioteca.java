package com.catalisa.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {
    //atributos
    private ArrayList<Livro> livros;
    private ArrayList<Usuario> usuarios;

    //construtor
    public void Biblioteca() {
        livros = new ArrayList<Livro>();
        usuarios = new ArrayList<Usuario>();
    }

    //metodos
    protected void cadastrarLivro(Livro livro) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("### CADASTRO DE LIVRO ###");
        System.out.println("Digite o título do livro: ");
        livro.setTitulo(leitura.nextLine());
        System.out.println("Digite o autor do livro: ");
        livro.setAutor(leitura.nextLine());
        System.out.println("ISBN do livro: ");
        livro.setIsbn(leitura.nextLine());
        System.out.println("Livro cadastrado com sucesso!");
        System.out.println(livro);
    }

}
