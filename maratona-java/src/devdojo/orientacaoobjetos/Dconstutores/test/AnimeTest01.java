package devdojo.orientacaoobjetos.Dconstutores.test;

import devdojo.orientacaoobjetos.Dconstutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Mushoku tensei", "TV", 56, "Isekai", "Mapa");

        anime.imprimir();
        System.out.println("----------");
    }
}
