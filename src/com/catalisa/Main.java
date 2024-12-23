package com.catalisa;

import com.catalisa.biblioteca.Biblioteca;
import com.catalisa.biblioteca.Livro;
import com.catalisa.usuario.Usuario;

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
            try {
                opcao = leitura.nextInt();
            }catch (Exception e){
                System.err.println("Digite somente numeros inteiros: " + e.getMessage());
                leitura.next();
                opcao = 0;
            }
            switch (opcao) {
                case 0:
                    break;
                case 1:
                    System.out.println("### CADASTRO DE LIVRO ###");
                    System.out.println("Digite o título do livro: ");
                    leitura.nextLine();
                    String titulo = leitura.nextLine();
                    System.out.println("Digite o autor do livro: ");
                    String autor = leitura.nextLine();
                    System.out.println("ISBN do livro: ");
                    String isbn = leitura.nextLine();
                    Livro livro = new Livro(titulo, autor, isbn, true);
                    biblioteca.cadastrarLivro(livro);
                    break;
                case 2:
                    System.out.println("### CADASTRO DE USUARIO ###");
                    System.out.println("Digite o nome do usuário:");
                    leitura.nextLine();
                    String nome = leitura.nextLine();
                    System.out.println("Digite o ID do usuário: ");
                    try {
                        int id = leitura.nextInt();
                        Usuario usuario = new Usuario(nome, id);
                        biblioteca.cadastrarUsuario(usuario);
                    }catch (Exception e){
                        System.err.println("Digite somente numeros inteiros: " + e.getMessage());
                        leitura.next();
                    }
                    break;
                case 3:
                    System.out.println("### REALIZAR UM EMPRESTIMO ###");
                    System.out.println("Digite o ISBN do livro: ");
                    isbn = leitura.next();
                    System.out.println("Digite o ID do usuario: ");
                    try {
                      int id = leitura.nextInt();
                        biblioteca.realizarEmprestimo(isbn, id);
                    }catch (Exception e){
                        System.err.println("Digite somente numeros inteiros: " + e.getMessage());
                        leitura.next();
                    }
                    break;
                case 4:
                    System.out.println("### REALIZAR DEVOLUÇÃO DO LIVRO ###");
                    System.out.println("Digite o ISBN do livro: ");
                    isbn = leitura.next();
                    System.out.println("Digite o ID do usuario: ");
                    try {
                        int id = leitura.nextInt();
                        biblioteca.realizarDevolucao(isbn, id);
                    }catch (Exception e){
                        System.err.println("Digite somente numeros inteiros: " + e.getMessage());
                        leitura.next();
                    }
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