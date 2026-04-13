package javacore.orientacaoobjetos.ZZBjdbc.test;

import javacore.orientacaoobjetos.ZZBjdbc.dominio.Producer;
import javacore.orientacaoobjetos.ZZBjdbc.repository.ProducerRepository;

public class ConnectionFactoryTest01 {
    public static void main(String[] args) {

        Producer producer = Producer.builder()
                .id(1)
                .name("Ayanokoji")
                .build();

        ProducerRepository.update(producer);


        // --- Adicionar novas linhas ---
//        Producer producer1 = Producer.builder()
//                .name("Chainsaw Man")
//                .build();
//        ProducerRepository.save(producer1);
//
//        Producer producer2 = Producer.builder()
//                .name("AOT")
//                .build();
//        ProducerRepository.save(producer2);
//
//        Producer producer3 = Producer.builder()
//                .name("Mushoku tensei")
//                .build();
//        ProducerRepository.save(producer3);


        //Tambem alem dessa forma podemos adicionar direto no SQL assim:
        //INSERT INTO anime_store.producer (name) VALUES ('Bleach');
        //INSERT INTO anime_store.producer (name) VALUES ('Dragon Ball');
    }
}