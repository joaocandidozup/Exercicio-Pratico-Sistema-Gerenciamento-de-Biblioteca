package com.catalisa.biblioteca;

import java.util.ArrayList;

public class Usuario {
    //atributos obs: private =(modificador de acesso)
    private String nome;
    private int id;
    private ArrayList<Livro> livrosEmprestados;

    //construtor
    public Usuario(String nome,int id){
        this.nome = nome;
        this.id = id;

    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public void setLivrosEmprestados(ArrayList<Livro> livrosEmprestados) {
        this.livrosEmprestados = livrosEmprestados;
    }

    //construtor
    public Usuario(String nome,int id,ArrayList<Livro>livrosEmprestados){
        this.nome = nome;
        this.id = id;
        this.livrosEmprestados = livrosEmprestados;
    //get e set

    }
    //metodos
    public void exibirDetalhes(){

    }
    public void adicionarLivro(Livro livro){

    }
    public void removerLivro(Livro livro){

    }
}
