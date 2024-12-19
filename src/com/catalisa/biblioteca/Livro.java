package com.catalisa.biblioteca;

public class Livro {
    //atributos
    private String titulo;
    private String autor;
    private String isbn;
    private boolean disponivel;

    //construtor
    public Livro(String titulo, String autor, String isbn, boolean disponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.disponivel = disponivel;
    }
    //get e set

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }


    //metodos

    public void exibirDetalhes() {

    }

    public void emprestar() {

    }

    public void devolver() {

    }

    @Override
    public String toString() {
        return "Livro {" +
                "\n  Título: " + titulo +
                "\n  Autor: " + autor +
                "\n  ISBN: " + isbn +
                "\n}";
    }
}
