package com.catalisa.biblioteca;

import java.util.ArrayList;

public class Biblioteca {
    //atributos
    private ArrayList<Livro> livros;
    private ArrayList<Usuario> usuarios;

    //construtor
    public Biblioteca() {
        super();
        livros = new ArrayList<Livro>();
        usuarios = new ArrayList<Usuario>();

    }

    //metodos
    public void cadastrarLivro(Livro livro) {
        livros.add(livro);
        System.out.println("Livro (" + livro.getTitulo() + ") Cadastrado com sucesso!");
    }

    public void cadastrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
        System.out.println("Usuario (" + usuario.getNome() + ") Cadastrado com sucesso!");
    }

    public void realizarEmprestimo(String isbn, int idUsuario) {
        for (Usuario usuario : usuarios) {
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
                System.out.println("Usuario não cadastrado");
            }
        }

    }


    public void exibirLivrosDisponiveis() {
//        for(Livro livro: livros){
//            livro.exibirDetalhes(livro);
//        }
        livros.forEach(livro -> livro.exibirDetalhes(livro));
    }
}