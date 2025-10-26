package testesJava.sistemaBanco;

import java.util.Scanner;

public class fazerLogin {
    public void login(String usuarioSalvo, int senhaSalva, String loginAdm, int senhaAdm) {

        String usuario;
        int senha;

        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu nome de usuário: ");
        usuario = input.nextLine();

        System.out.print("Digite sua senha: ");
        senha = Integer.parseInt(input.nextLine());

        if (usuario.equals(loginAdm) && senha == senhaAdm) {
            System.out.println("Login de administrador bem-sucedido!");
            return;
        }

        if (usuario.equals(usuarioSalvo) && senha == senhaSalva) {
            System.out.println("Login bem-sucedido! Bem-vindo, " + usuario + "!");
        } else {
            System.out.println("Usuário ou senha incorretos!");
        }
    }
}
