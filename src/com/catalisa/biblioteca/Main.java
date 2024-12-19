import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int opcao = 0;
        System.out.println(" Bem-vindo ao Sistema de Gerenciamento de Biblioteca!");
        while (opcao != 6) {
            exibeMenu();
            System.out.println("Digite uma opcao: ");
            opcao = leitura.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Cadastrar livro.");
                    break;
                case 2:
                    System.out.println("Cadastrar usuário.");
                    break;
                case 3:
                    System.out.println("Realizar empréstimo.");
                    break;
                case 4:
                    System.out.println("Realizar devolução.");
                    break;
                case 5:
                    System.out.println("Exibir livros disponíveis.");
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