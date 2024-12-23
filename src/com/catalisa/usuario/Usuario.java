package com.catalisa.usuario;

import com.catalisa.biblioteca.Livro;

import java.util.ArrayList;

public class Usuario {
    private String nome;
    private int id;
    private ArrayList<Livro> livrosEmprestados;

    public Usuario(String nome, int id) {
        this.nome = nome;
        this.id = id;
        this.livrosEmprestados = new ArrayList<Livro>();
    }

    public int getId() {
        return id;
    }

    public ArrayList<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public void exibirDetalhes(Livro livro) {
        System.out.println(livrosEmprestados);
    }

    public void exibirDetalhes(Usuario usuario) {
        System.out.println(usuario);
    }

    public void adicionarLivro(Livro livro) {
        livrosEmprestados.add(livro);
    }

    public void removerLivro(Livro livro) {
        livrosEmprestados.remove(livro);
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nome= " + nome +
                ", id= " + id +
                "}";
    }

}
