package Biblioteca_Manga.dataBase;

import Biblioteca_Manga.dominio.Categorias;
import Biblioteca_Manga.dominio.Cliente;
import Biblioteca_Manga.dominio.Manga;

import java.util.ArrayList;
import java.util.List;

public class dataBase {
        public static List<Cliente> clientes = new ArrayList<>();
        public static List<Manga> mangas = new ArrayList<Manga>();

        static {

            //Mangas
            mangas.add(new Manga("Berserk", 59.4, Categorias.SEINEN));
            mangas.add(new Manga("Chainsaw Man", 26.7, Categorias.SEINEN));
            mangas.add(new Manga("Horimiya", 31.5, Categorias.ROMANCE));
            mangas.add(new Manga("Haikyu!!", 29.5, Categorias.ESPORTE));
            mangas.add(new Manga("Naruto", 29.2, Categorias.SHOUNEN));

            //Clientes
            clientes.add(new Cliente("Jorge", 19));
            clientes.add(new Cliente("Arthur", 28));
            clientes.add(new Cliente("Vinicius", 42));
            clientes.add(new Cliente("Julia", 19));
            clientes.add(new Cliente("Maria", 28));
            clientes.add(new Cliente("Fransisco", 18));
        }
}
