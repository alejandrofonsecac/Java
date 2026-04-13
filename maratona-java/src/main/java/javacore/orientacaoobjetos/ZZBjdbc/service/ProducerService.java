package javacore.orientacaoobjetos.ZZBjdbc.service;

import javacore.orientacaoobjetos.ZZBjdbc.dominio.Producer;
import javacore.orientacaoobjetos.ZZBjdbc.repository.ProducerRepository;

public class ProducerService {
    public static void save(Producer producer){
        ProducerRepository.save(producer);
    }

    public static void update(Producer producer){
        ProducerRepository.update(producer);
    }

    public static void delete(int id){
        ProducerRepository.delete(id);
    }
}
