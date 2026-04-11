package Biblioteca_Manga.service;

import java.util.List;
import java.util.Scanner;
import Biblioteca_Manga.dataBase.dataBase;
import Biblioteca_Manga.dominio.Cliente;
import Biblioteca_Manga.dominio.Manga;

import static Biblioteca_Manga.dataBase.dataBase.mangas;

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
        Scanner input = new Scanner(System.in);


        mangas.forEach(manga -> System.out.println(manga.toString()));

        Manga mangaRemove = null;
        System.out.println("Digite o id do mangá requerido: ");
        Long idRequest = input.nextLong();

        for (Manga manga: mangas){
            if (idRequest.equals(manga.getId())){
                System.out.println("Mangá encontado: " + manga.getNome());
                System.out.println(manga.getPreco());

                mangaRemove = manga;
                break;
            }
        }

        if (mangaRemove != null){
            mangas.remove(mangaRemove);
        }
    }
}
