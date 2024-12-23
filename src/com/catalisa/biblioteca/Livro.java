package com.catalisa.biblioteca;

public class Livro implements IEmprestavel {
    private String titulo;
    private String autor;
    private String isbn;
    private boolean disponivel;

    public Livro(String titulo, String autor, String isbn, boolean disponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.disponivel = disponivel;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void exibirDetalhes(Livro livro) {
        System.out.println(livro);

    }
    @Override
    public void emprestar() {
        if (disponivel) {
            disponivel = false;
            System.out.println("Emprestimo realizado com sucesso!");
        } else {
            System.out.println("Livro indisponível!");
        }
    }
    @Override
    public void devolver() {
        disponivel = true;
        System.out.println("Livro devolvido!");
    }

    @Override
    public String toString() {
        return "livro{" +
                "titulo= " + titulo +
                ", autor= " + autor +
                ", isbn= " + isbn +
                "}";
    }

}
