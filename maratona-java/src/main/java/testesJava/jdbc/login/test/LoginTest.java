package testesJava.jdbc.login.test;

import testesJava.jdbc.login.domain.User;
import testesJava.jdbc.login.service.UserService;

import java.sql.SQLException;
import java.util.Scanner;

public class LoginTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Bem-vindo o que você deseja?");
        System.out.println("1 - Login\n2 - Criar conta\n3 - Sair");
        int escolha = in.nextInt();

            switch (escolha){
                case 1:
                    in.nextLine();
                    System.out.println("Digite seu nome: ");
                    String nameLogin = in.nextLine();
                    in.nextLine();
                    System.out.println("Digite sua senha: ");
                    String passwordLogin = in.nextLine();
                    in.nextLine();
                    UserService.login(nameLogin, passwordLogin);

                    boolean sucesso = UserService.login(nameLogin, passwordLogin);
                    if (sucesso) {
                        System.out.println("Login realizado com sucesso! Bem-vindo, " + nameLogin);
                    } else {
                        System.out.println("Usuário ou senha incorretos.");
                    }
                    break;
                case 2:
                    in.nextLine();
                    System.out.println("Digite seu nome: ");
                    String name = in.nextLine();
                    in.nextLine();
                    System.out.println("Digite sua nova senha: ");
                    String password = in.nextLine();
                    in.nextLine();
                    try {
                        UserService.register(name, password);
                    } catch (SQLException e) {
                        throw new RuntimeException(e);
                    }

                    boolean sucesso2 = UserService.login(name, password);
                    if (sucesso2) {
                        System.out.println("Login realizado com sucesso! Bem-vindo, " + name);
                    } else {
                        System.out.println("Usuário ou senha incorretos.");
                    }
                    break;

                default:
                    throw new IllegalArgumentException("Argumento Invalido");
            }
        }
    }