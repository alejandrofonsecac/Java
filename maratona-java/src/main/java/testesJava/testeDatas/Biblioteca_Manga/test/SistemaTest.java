package testesJava.testeDatas.Biblioteca_Manga.test;

import testesJava.testeDatas.Biblioteca_Manga.dataBase.dataBase;
import testesJava.testeDatas.Biblioteca_Manga.service.ClienteService;
import testesJava.testeDatas.Biblioteca_Manga.service.MangaService;

import testesJava.testeDatas.Biblioteca_Manga.service.PedidoService;

import java.util.Scanner;

public class SistemaTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("O que você deseja fazer?");
        boolean isRunning = true;
        do{
            System.out.println("1 - Cadastrar Mangá\n2 - Cadastrar cliente\n3 - Listar Mangás\n4 - Fazer pedido\n5 - Processar pedido\n6 - Sair");
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
                        break;
                    case 5:
                        PedidoService.processarPedido();
                        break;
                    case 6:
                        isRunning = false;
                }
            }while (isRunning);



    }
}
