package com.catalisa;

import com.catalisa.biblioteca.Biblioteca;
import com.catalisa.biblioteca.Livro;
import com.catalisa.biblioteca.Usuario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner leitura = new Scanner(System.in);
        int opcao = 0;
        System.out.println(" Bem-vindo ao Sistema de Gerenciamento de Biblioteca!");
        while (opcao != 6) {
            exibeMenu();
            System.out.println("Digite uma opcao: ");
            opcao = leitura.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("### CADASTRO DE LIVRO ###");
                    System.out.println("Digite o título do livro: ");
                    String titulo = leitura.next();
                    System.out.println("Digite o autor do livro: ");
                    String autor = leitura.next();
                    System.out.println("ISBN do livro: ");
                    String isbn = leitura.next();
                    Livro livro = new Livro(titulo, autor, isbn, true);
                    biblioteca.cadastrarLivro(livro);
                    break;
                case 2:
                    System.out.println("### CADASTRO DE USUARIO ###");
                    System.out.println("Digite o nome do usuário:");
                    String nome = leitura.next();
                    System.out.println("Digite o ID do usuário: ");
                    int id = leitura.nextInt();
                    Usuario usuario = new Usuario(nome, id);
                    biblioteca.cadastrarUsuario(usuario);
                    break;
                case 3:
                    System.out.println("### REALIZAR UM EMPRESTIMO ###");
                    System.out.println("Digite o ISBN do livro: ");
                    isbn = leitura.next();
                    System.out.println("Digite o ID do usuario: ");
                    id = leitura.nextInt();
                    biblioteca.realizarEmprestimo(isbn, id);
                    break;
                case 4:
                    System.out.println("Realizar devolução.");
                    break;
                case 5:
                    biblioteca.exibirLivrosDisponiveis();
                    break;
                default:
                    System.out.println("Saindo da aplicação....");
                    break;


            }
        }
    }


    public static void exibeMenu() {
        String menu = """
                
                1 - Cadastrar livro
                2 - Cadastrar usuário
                3 - Realizar emprestimo
                4 - Realizar devolução
                5 - Exibir livros
                6 - Sair
                """;
        System.out.println(menu);
    }
}