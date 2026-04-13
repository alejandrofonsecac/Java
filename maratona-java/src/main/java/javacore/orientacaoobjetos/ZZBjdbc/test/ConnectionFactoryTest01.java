package javacore.orientacaoobjetos.ZZBjdbc.test;

import javacore.orientacaoobjetos.ZZBjdbc.dominio.Producer;
import javacore.orientacaoobjetos.ZZBjdbc.repository.ProducerRepository;
import javacore.orientacaoobjetos.ZZBjdbc.service.ProducerService;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class ConnectionFactoryTest01 {
    public static void main(String[] args) {

        //Criando um novo valor na tabela
        Producer producer = Producer.builder().name("Test").build();
//        ProducerService.save(producer);
        ProducerService.delete(15);
        ProducerService.delete(16);
        ProducerService.delete(17);

//        //Autalizando um valor
//        Producer producer = Producer.builder().id(1).name("Ayanokoji").build();


//        log.info("INFO");
//        log.debug("debug");
//        log.warn("warn");
//        log.error("error");
//        log.trace("trace");

        //Tambem alem dessa forma podemos adicionar direto no SQL assim:
        //INSERT INTO anime_store.producer (name) VALUES ('Bleach');
        //INSERT INTO anime_store.producer (name) VALUES ('Dragon Ball');
    }
}