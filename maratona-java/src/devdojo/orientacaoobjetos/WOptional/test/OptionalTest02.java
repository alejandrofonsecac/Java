package devdojo.orientacaoobjetos.WOptional.test;

import devdojo.orientacaoobjetos.WOptional.dominio.Manga;
import devdojo.orientacaoobjetos.WOptional.repository.MangaRepository;

import java.util.*;

public class OptionalTest02 {
    public static void main(String[] args) {

        Optional<Manga> mangaByName = MangaRepository.findByName("Berserk");
        mangaByName.ifPresent(m -> m.setName("Berserk2"));
        System.out.println(mangaByName);

        Manga mangaById = MangaRepository.findById(3)
                .orElseThrow(IllegalArgumentException::new);
        System.out.println(mangaById);

        Manga newManga = MangaRepository.findByName("Naruto")
                .orElse(new Manga(5, 510, "Naruto"));
        System.out.println(newManga);
    }
}
