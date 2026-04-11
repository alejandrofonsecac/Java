package testesJava.testeDatas.Biblioteca_Manga.service;

import testesJava.testeDatas.Biblioteca_Manga.dominio.Categorias;
import testesJava.testeDatas.Biblioteca_Manga.dataBase.dataBase;
import testesJava.testeDatas.Biblioteca_Manga.dominio.Manga;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class MangaService {

    public static long gerarId(List<Manga> mangas) {
        long id;
        boolean existe;

        do {
            id = ThreadLocalRandom.current().nextLong(0, 100000);
            existe = false;

            for (Manga manga : mangas) {
                if (manga.getId() == id) {
                    existe = true;
                    break;
                }
            }

        } while (existe);

        return id;
    }


    public static void cadastrarManga() {
        Scanner input = new Scanner(System.in);

        try{
            System.out.println("Nome: ");
            String nome = input.nextLine();

            System.out.println("Preço: ");
            double preco = input.nextDouble();

            System.out.println("Escolha uma categoria: ");
            Categorias[] categoriasDisponiveis = Categorias.values();

            for (int i = 0; i < categoriasDisponiveis.length; i++) {
                System.out.println((i + 1) + " - " + categoriasDisponiveis[i]);
            }

            int categoria = input.nextInt();
            Categorias categoriaSelecionada = categoriasDisponiveis[categoria - 1];

            long id = gerarId((List<Manga>) dataBase.mangas);

            dataBase.mangas.add(new Manga(id, nome, preco, categoriaSelecionada));

            System.out.println("Mangá cadastrado com sucesso!");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
