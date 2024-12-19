package com.catalisa.biblioteca;

import java.util.ArrayList;

public class Usuario {
    //atributos obs: private =(modificador de acesso)
    private String nome;
    private int id;
    private ArrayList<Livro> livrosEmprestados;
    //construtor
    public Usuario(String nome,int id,ArrayList<Livro>livrosEmprestados){
        this.nome = nome;
        this.id = id;
        this.livrosEmprestados = livrosEmprestados;

    }
    //metodos
    public void exibirDetalhes(){

    }
    public void adicionarLivro(Livro livro){

    }
    public void removerLivro(Livro livro){

    }
}
