package Biblioteca_Manga.service;

import java.util.Scanner;
import Biblioteca_Manga.dataBase.dataBase;
import Biblioteca_Manga.dominio.Cliente;

public class ClienteService {
    public static void cadastroCliente(){
        boolean cadastro = false;

        Scanner input = new Scanner(System.in);

        System.out.println("Insira o nome: ");
        String nome = input.nextLine();
        System.out.println("Insira sua idade: ");
        int idade = input.nextInt();

        dataBase.clientes.add(new Cliente(nome, idade));

        System.out.println("Crie um login e senha: ");
        System.out.println("Login: ");
        String login = input.nextLine();
        System.out.println("Senha:  ");
        int senha = input.nextInt();

        cadastro = true;
    }

    public static void fazerPedido(boolean cadastro){
        if (cadastro == false){
            System.out.println("Realize um cadastro");
        }

        dataBase.mangas.forEach(manga -> System.out.println(manga.toString()));

        
    }
}
