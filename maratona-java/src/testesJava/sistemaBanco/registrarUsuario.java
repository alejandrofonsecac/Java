package testesJava.sistemaBanco;
import java.util.Scanner;

public class registrarUsuario {
    public Object[] register(){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu login: ");
        String login = input.nextLine();

        System.out.print("Digite sua senha (apenas números): ");
        int senha = Integer.parseInt(input.nextLine());

        System.out.println("Usuário registrado com sucesso!");

        return new Object[]{login, senha};
    }
}
