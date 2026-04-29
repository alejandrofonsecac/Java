package javacore.orientacaoobjetos.ZZBjdbc.test;

import javacore.orientacaoobjetos.ZZBjdbc.dominio.Producer;
import javacore.orientacaoobjetos.ZZBjdbc.repository.ProducerRepositoryRowSet;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class ConnectionFactoryTest02 {
    private static final Logger log = LogManager.getLogger(ConnectionFactoryTest02.class);

    public static void main(String[] args) {
        List<Producer> producers = ProducerRepositoryRowSet.findByNameJdbcRowSet("AOT");
        log.info(producers);
    }
}
