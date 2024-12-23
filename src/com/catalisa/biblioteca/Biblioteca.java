package com.catalisa.biblioteca;

import com.catalisa.usuario.Usuario;

import java.io.FileWriter;
import java.io.IOException;
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
        salvarObjetoEmArquivo(livro,"livros_cadastrados.txt");
    }

    public void cadastrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
        System.out.println("Usuario Cadastrado com sucesso!");
        usuario.exibirDetalhes(usuario);
        salvarObjetoEmArquivo(usuario,"usuarios_cadastrados.txt");
    }

    public void realizarEmprestimo(String isbn, int idUsuario) {
        Livro livro = encontrarLivroPorIsbn(isbn);
        Usuario usuario = encontrarUsuarioPorId(idUsuario);

        if (livro == null) {
            System.out.println("Livro não encontrado!   ");
            return;
        }

        if (usuario == null) {
            System.out.println("Usuário não encontrado!");
            return;
        }

        if (usuario.getLivrosEmprestados().size() == 3) {
            System.out.println("Usuario ja pegou 3 livros enprestados!");
            return;
        }

        if (!livro.isDisponivel()) {
            System.out.println("Livro já está emprestado!");

        } else {
            livros.remove(livro);
            usuario.adicionarLivro(livro);
            usuario.exibirDetalhes(livro);
            livro.emprestar();
            salvarObjetoEmArquivo(livro,"livros_emprestados.txt");
        }
    }

    public void realizarDevolucao(String isbn, int idUsuario) {
        Livro livro = encontrarLivroEmprestadoPorIsbn(isbn);
        Usuario usuario = encontrarUsuarioPorId(idUsuario);

        if (livro == null) {
            System.out.println("Livro não encontrado!");
            return;
        }

        if (usuario == null) {
            System.out.println("Usuário não encontrado!");
            return;
        }

        if (!livro.isDisponivel()) {
            usuario.exibirDetalhes(livro);
            usuario.removerLivro(livro);
            livros.add(livro);
            livro.devolver();
        }
    }

    public void exibirLivrosDisponiveis() {
        for (Livro livro : livros) {
            livro.exibirDetalhes(livro);
        }
    }
    private Livro encontrarLivroPorIsbn(String isbn) {
        for (Livro livro : livros) {
            if (livro.getIsbn().equals(isbn)) {
                return livro;
            }
        }
        return null;
    }
    private Usuario encontrarUsuarioPorId(int id) {
        for (Usuario usuario : usuarios) {
            if (usuario.getId() == id) {
                return usuario;
            }
        }
        return null;
    }
    private Livro encontrarLivroEmprestadoPorIsbn(String isbn) {
        for (Usuario usuario : usuarios) {
            for (Livro livro : usuario.getLivrosEmprestados()) {
                if (livro.getIsbn().equals(isbn)) {
                    return livro;
                }
            }
        }
        return null;
    }
    private static void salvarObjetoEmArquivo(Object objeto, String nomeArquivo) {
        try (FileWriter writer = new FileWriter(nomeArquivo, true)) {
            String linha = objeto.toString() + "\n";
            writer.write(linha);
        } catch (IOException e) {
            System.err.println("Erro ao escrever no arquivo: " + e.getMessage());
        }
    }
}