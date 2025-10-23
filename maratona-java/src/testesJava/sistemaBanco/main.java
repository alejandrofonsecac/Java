package testesJava.sistemaBanco;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int tentativas = 3;
        String login = "Jorge";
        int senha = 123;

        String loginAdm = "admin";
        int senhaAdm = 123;

        String loginUser;
        int senhaUser;

        int cont;
        System.out.println("---Acesso---\n 1: Login \n 2: Registrar \n 3: Sair ");
        Scanner input = new Scanner(System.in);
        String cout = input.nextLine();
        switch (cout) {
            case "1":
                System.out.println("Digite seu login: ");
                loginUser = input.nextLine();
                System.out.println("Digite seu senha: ");
                senhaUser = input.nextInt();

                if(loginUser.equals("admin") && senhaUser == senha) {
                    
                }
        }



        /*

        while(tentativas>0){
            if(tentativas%2==0){
                System.out.println("\nVocê tem " + tentativas + " tentativas");
            } if(tentativas%2==1){
                System.out.println("\nVocê tem " + tentativas + " tentativas");
            }else{
                System.out.println("\nVocê não tem tentativas mais restantes");
            }

            Scanner sc = new Scanner(System.in);
            System.out.println("Digite seu login: ");
            loginUser = sc.nextLine();
            System.out.println("Digite seu senha: ");
            senhaUser = sc.nextInt();

            if (loginUser.equals(loginAdm) && senhaUser == senhaAdm) {
                System.out.println("Bem vindo, ao acesso de ADM!");
            }else{
                System.out.println("Login ou senha incorreta");
            }

            if (loginUser.equals(login) && senhaUser == senha) {
                System.out.println("Login efetuado com sucesso");
            }else {
                System.out.println("Login ou senha incorreta");
            }
            tentativas--;
        }
        */





    }
}
