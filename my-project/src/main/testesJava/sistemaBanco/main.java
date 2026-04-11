package testesJava.sistemaBanco;
import testesJava.sistemaBanco.fazerLogin;
import  testesJava.sistemaBanco.registrarUsuario;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        String loginAdm = "admin";
        int senhaAdm = 0;

        String login = null;
        int senha;

        String loginSalvo = null;
        int senhaSalva = -1;

        fazerLogin objLogin = new fazerLogin();
        registrarUsuario objRegistro = new registrarUsuario();

        Scanner input = new Scanner(System.in);
        fazerLogin obj = new fazerLogin();
        registrarUsuario obj2 = new registrarUsuario();

        while (true) {
            System.out.println("\n---Acesso---");
            System.out.println("1: Login");
            System.out.println("2: Registrar");
            System.out.println("3: Sair");
            System.out.print("Escolha uma opção: ");

            String opcao = input.nextLine();

            switch (opcao) {
                case "1":
                    objLogin.login(loginSalvo, senhaSalva, loginAdm, senhaAdm); 
                    break;
                case "2":
                    Object [] dados =  objRegistro.register();
                    loginSalvo = (String) dados[0];
                    senhaSalva = (int)  dados[1];
                    break;
                case "3":
                    System.out.println("Saindo do sistema...");
                    input.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}