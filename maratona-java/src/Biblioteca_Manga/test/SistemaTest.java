package Biblioteca_Manga.test;

import Biblioteca_Manga.dataBase.dataBase;
import Biblioteca_Manga.dominio.Categorias;
import Biblioteca_Manga.service.ClienteService;
import Biblioteca_Manga.service.MangaService;

import java.util.Random;
import java.util.Scanner;

public class SistemaTest {
    private static Random scanner;
    private static Categorias Categorias;
    private static Long id;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("O que você deseja fazer?");
        System.out.println("1 - Cadastrar Mangá\n2 - Cadastrar cliente\n3 - Listar Mangás\n4 - Fazer pedido\n5 - Processar pedido");
        int escolha = input.nextInt();

        boolean cadastro = false;

        switch (escolha){
            case 1:
                MangaService.cadastrarManga();
                break;
            case 2:
                ClienteService.cadastroCliente();
                break;
            case 3:
                System.out.println("Mangás: ");
                dataBase.mangas.forEach(manga -> System.out.println(manga.toString()));
                break;
            case 4:
                ClienteService.fazerPedido(cadastro);
        }

        System.out.println("Mangas: ");
        dataBase.mangas.forEach(mangas ->
                System.out.println(mangas.toString()));

    }
}
