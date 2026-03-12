package Biblioteca_Manga.service;

import java.util.Scanner;
import Biblioteca_Manga.dataBase.dataBase;
import Biblioteca_Manga.dominio.Cliente;

public class ClienteService {
    public static void cadastroCliente(){
        Scanner input = new Scanner(System.in);

        System.out.println("Insira o nome: ");
        String nome = input.nextLine();
        System.out.println("Insira sua idade: ");
        int idade = input.nextInt();

        dataBase.clientes.add(new Cliente(nome, idade));
    }
}
