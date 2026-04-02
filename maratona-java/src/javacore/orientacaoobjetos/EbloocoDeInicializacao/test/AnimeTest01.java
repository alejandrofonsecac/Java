package javacore.orientacaoobjetos.EbloocoDeInicializacao.test;
import javacore.orientacaoobjetos.EbloocoDeInicializacao.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        for ( int episodio : anime.getEpisodios() ) {
            System.out.print( episodio + " ");
        }
    }
}
