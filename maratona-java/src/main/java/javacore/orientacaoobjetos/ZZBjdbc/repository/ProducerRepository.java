package javacore.orientacaoobjetos.ZZBjdbc.repository;

import javacore.orientacaoobjetos.ZZBjdbc.conn.ConnectionFactory;
import javacore.orientacaoobjetos.ZZBjdbc.dominio.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;

@Log4j2
public class ProducerRepository {
    //Operação   	O que faz
    //INSERT    ->	cria nova linha
    //UPDATE    ->	altera linha existente
    //WHERE id  ->	define qual linha alterar

    public static void update(Producer producer){
        String sql = "UPDATE anime_store.producer SET  name = ? WHERE  id = ?";
        //INSERT INTO adiciona uma nova linha no SQL

        try(Connection conn = ConnectionFactory.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, producer.getName());
            ps.setInt(2, producer.getId());
            int rowsAffected = ps.executeUpdate();
            log.info("Data Base rows affected {}", rowsAffected);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
