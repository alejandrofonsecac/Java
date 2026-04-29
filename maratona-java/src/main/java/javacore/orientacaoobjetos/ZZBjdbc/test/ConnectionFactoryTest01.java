package javacore.orientacaoobjetos.ZZBjdbc.test;

import javacore.orientacaoobjetos.ZZBjdbc.dominio.Producer;
import javacore.orientacaoobjetos.ZZBjdbc.repository.ProducerRepository;
import javacore.orientacaoobjetos.ZZBjdbc.service.ProducerService;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@Log4j2
public class ConnectionFactoryTest01 {
    public static void main(String[] args) {

        //Criando um novo valor na tabela
        Producer producer = Producer.builder().name("Test").build();

        Producer producerToUpdate = Producer.builder().id(1).name("Studio Bind").build();

//        ProducerService.update(producerToUpdate);
//        ProducerService.save(producer);
//        ProducerService.delete(15);

//        List<Producer> producers = ProducerRepository.findAll();
//        log.info("Producers found '{}'", producers);

//        List<Producer> producers = ProducerRepository.findByName("Studio Mappa");
//        log.info("Producters found '{}'", producers);
//        ProducerService.showProducerMetaData();

//        ProducerService.showDriverMetaData();
//        ProducerService.showTypeScrollWorking();

//        List<Producer> producers = ProducerService.findByNameAndUpdateToUpperCase("Mappa");
//        log.info("Producters found '{}'", producers);

//        List<Producer> producers = ProducerService.findByNameAndInsertWhenNotFound("Subaru");
//        log.info("Producters found '{}'", producers);

//        ProducerService.findByNameAndDelete("Subaru");

        List<Producer> producers = ProducerService.findByNamePreparedStatement("Test");
        log.info("Producters found '{}'", producers);





        // =============================================

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