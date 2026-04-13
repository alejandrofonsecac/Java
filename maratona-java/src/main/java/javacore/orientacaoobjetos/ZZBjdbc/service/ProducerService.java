package javacore.orientacaoobjetos.ZZBjdbc.service;

import javacore.orientacaoobjetos.ZZBjdbc.dominio.Producer;
import javacore.orientacaoobjetos.ZZBjdbc.repository.ProducerRepository;

public class ProducerService {
    public static void save(Producer producer){
        ProducerRepository.save(producer);
    }

    public static void update(Producer producer){
        requiredValidId(producer.getId());
        ProducerRepository.update(producer);
    }

    public static void delete(Integer id){
        requiredValidId(id);
        ProducerRepository.delete(id);
    }

    public static void requiredValidId(Integer id){
        if (id == null || id <= 0){
            throw new IllegalArgumentException("Invalid Id");
        }
    }
}
