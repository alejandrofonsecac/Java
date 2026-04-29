package javacore.orientacaoobjetos.ZZBjdbc.service;

import javacore.orientacaoobjetos.ZZBjdbc.dominio.Producer;
import javacore.orientacaoobjetos.ZZBjdbc.repository.ProducerRepositoryRowSet;

import java.util.List;

public class ProducerServiceRowSet {
    public static List<Producer> findByNameRowSet(String name){
        return ProducerRepositoryRowSet.findByNameJdbcRowSet(name);
    }

    public static void updateJdbcRowSet(Producer producer){
        ProducerRepositoryRowSet.updateJdbcRowSet(producer);
    }
}
