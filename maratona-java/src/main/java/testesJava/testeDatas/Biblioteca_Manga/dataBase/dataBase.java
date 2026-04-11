package testesJava.testeDatas.Biblioteca_Manga.dataBase;

import testesJava.testeDatas.Biblioteca_Manga.dominio.Categorias;
import testesJava.testeDatas.Biblioteca_Manga.dominio.Cliente;
import testesJava.testeDatas.Biblioteca_Manga.dominio.Manga;

import java.util.*;

public class dataBase {
        public static Queue<Cliente> clientes = new PriorityQueue<>();
        public static Set<Manga> mangas = new HashSet<>();

        static {

            //Mangas
            mangas.add(new Manga(123_435L,"Berserk", 59.4, Categorias.SEINEN));
            mangas.add(new Manga(654_321L,"Chainsaw Man", 26.7, Categorias.SEINEN));
            mangas.add(new Manga(325_234L,"Horimiya", 31.5, Categorias.ROMANCE));
            mangas.add(new Manga(234L,"Haikyu!!", 29.5, Categorias.ESPORTE));
            mangas.add(new Manga(32_123L,"Naruto", 29.2, Categorias.SHOUNEN));
            mangas.add(new Manga(31_010L,"DragonBall Z", 39.2, Categorias.SHOUNEN));

            //Clientes
            clientes.add(new Cliente("Jorge", 19, 123_435L));
            clientes.add(new Cliente("Arthur", 28));
            clientes.add(new Cliente("Vinicius", 42));
            clientes.add(new Cliente("Julia", 19));
            clientes.add(new Cliente("Maria", 28));
            clientes.add(new Cliente("Fransisco", 18));
        }

        protected String login = "123";
        protected int senha = 123;
}