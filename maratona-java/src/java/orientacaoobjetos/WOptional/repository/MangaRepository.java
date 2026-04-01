package java.orientacaoobjetos.WOptional.repository;

import java.orientacaoobjetos.WOptional.dominio.Manga;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class MangaRepository {
    private static List<Manga> mangas = new ArrayList<>(Arrays.asList(new Manga(1, 16, "Serial Expriments Lain"), new Manga(2, 129, "Chainsaw Mans"), new Manga(3, 254, "Berserk")));

    public static Optional<Manga> findByName(String title){
        return findBy(m -> m.getName().equals(title));
    }

    public static Optional<Manga> findById(Integer id){
        return findBy(m -> m.getId().equals(id));
    }

    private static Optional<Manga> findBy(Predicate<Manga> predicate){
        Manga found = null;
        for (Manga manga : mangas){
            if (predicate.test(manga)){
                found = manga;
            }
        }
        return Optional.ofNullable(found);
    }
}
