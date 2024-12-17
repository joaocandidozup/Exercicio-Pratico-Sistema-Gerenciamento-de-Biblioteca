import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int opcao = 0;
        while(opcao !=6){
            menu();
            System.out.println("Digite uma opcao: ");
            opcao = leitura.nextInt();
        }
    }
    public static void menu(){
        String menu = """
                Bem-vindo ao Sistema de Gerenciamento de Biblioteca!
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