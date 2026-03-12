package Biblioteca_Manga.service;

import Biblioteca_Manga.dominio.Categorias;
import Biblioteca_Manga.dataBase.dataBase;
import Biblioteca_Manga.dominio.Manga;

import java.util.Scanner;

public class MangaService {
    public static void cadastrarManga(Categorias Categorias){
        Scanner input = new Scanner(System.in);

        try{
            System.out.println("Nome: ");
            String nome = input.nextLine();
            System.out.println("Preço: ");
            double preco = input.nextDouble();


            System.out.println("Escolha um categoria: ");
            Categorias[] categoriasDisponiveis = Categorias.values();
            for (Categorias categoria: categoriasDisponiveis){
                System.out.println("1 - " + categoria);
            }
            int categoria = input.nextInt();
            Categorias categoriaSelecionada = categoriasDisponiveis[categoria - 1];

            dataBase.mangas.add(new Manga(nome, preco, categoriaSelecionada));
            System.out.println("Mangá cadastrado com sucesso!");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
