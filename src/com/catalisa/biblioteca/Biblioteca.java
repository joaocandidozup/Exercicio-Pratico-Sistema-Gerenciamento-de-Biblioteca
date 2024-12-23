package com.catalisa.biblioteca;

import com.catalisa.usuario.Usuario;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Livro> livros;
    private ArrayList<Usuario> usuarios;

    public Biblioteca() {
        livros = new ArrayList<Livro>();
        usuarios = new ArrayList<Usuario>();
    }

    public void cadastrarLivro(Livro livro) {
        livros.add(livro);
        System.out.println("Livro cadastrado com sucesso!");
    }

    public void cadastrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
        System.out.println("Usuario Cadastrado com sucesso!");
        usuario.exibirDetalhes(usuario);
    }

    public void realizarEmprestimo(String isbn, int idUsuario) {
        for (Usuario usuario : usuarios) {
            if (usuario.getLivrosEmprestados().size() < 4) {
                if (usuario.getId() == idUsuario) {
                    for (Livro livro : livros) {
                        if (livro.getIsbn().equals(isbn)) {
                            usuario.adicionarLivro(livro);
                            System.out.println(" livro adicionado com sucesso");
                            livros.remove(livro);
                            System.out.println(usuario.getLivrosEmprestados());//debug
                            break;
                        } else {
                            System.out.println("Livro não cadastrado");
                        }
                    }
                } else {
                    System.out.println("Usuario não cadastrado!");
                }
            } else {
                System.out.println("Voçê alcançou o limite de livros que pode ser emprestado!!!");
            }
        }

    }

    public void exibirLivrosDisponiveis() {
        for (Livro livro : livros) {
            livro.exibirDetalhes(livro);
        }
    }
}