package com.catalisa.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {
    //atributos
    private ArrayList<Livro> livros;
    private ArrayList<Usuario> usuarios;

    //construtor
    public Biblioteca() {
        livros = new ArrayList<Livro>();
        usuarios = new ArrayList<Usuario>();

    }

    //metodos
    protected void cadastrarLivro(Livro livro) {
        livros.add(livro);
        System.out.println("Livro (" + livro.getTitulo() + ") Cadastrado com sucesso!");
    }

    protected void cadastrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
        System.out.println("Usuario (" + usuario.getNome() + ") Cadastrado com sucesso!");
    }

}
