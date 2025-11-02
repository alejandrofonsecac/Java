package devdojo.orientacaoobjetos.CsobreCargaDeMetodos.test;
import  devdojo.orientacaoobjetos.CsobreCargaDeMetodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Mushoku tensei", "TV", 56, "Isekai");

        anime.imprimir();
    }
}
