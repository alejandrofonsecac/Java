package javacore.orientacaoobjetos.ZZBjdbc.repository;

import javacore.orientacaoobjetos.ZZBjdbc.conn.ConnectionFactory;
import javacore.orientacaoobjetos.ZZBjdbc.dominio.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;

@Log4j2
public class ProducerRepository {
    //Operação   	O que faz
    //INSERT    ->	cria nova linha
    //UPDATE    ->	altera linha existente
    //WHERE id  ->	define qual linha alterar

    public static void update(Producer producer) {
        String sql = "UPDATE anime_store.producer SET name = ? WHERE id = ?";

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, producer.getName());
            ps.setInt(2, producer.getId());
            int rowsAffected = ps.executeUpdate();
            log.info("Update producer '{}', rows affected {}", producer.getId(), rowsAffected);
        } catch (SQLException e) {
            log.error("Error while trying to update producer '{}'", producer.getId(), e);
        }
    }

    public static void save(Producer producer) {
        String sql = "INSERT INTO anime_store.producer (name) VALUES (?)";
        //INSERT INTO adiciona uma nova linha no SQL

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, producer.getName());
            int rowsAffected = ps.executeUpdate();
            ps.setString(1, producer.getName());
            log.info("Inserted producer '{}' in the data base, rows affected {}", producer.getName(), rowsAffected);
        } catch (SQLException e) {
            log.error("Error while trying to insert producer '{}'", producer.getName(), e);
        }
    }
    //DELETE FROM `anime_store`.`producer` WHERE (`id` = '13');

    public static void delete(int id) {
        String sql = "DELETE FROM anime_store.producer WHERE id = ?";
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            int rowsAffected = ps.executeUpdate();
            log.info("Deleted producer '{}' from the data base, rows affected {}", id, rowsAffected);
        } catch (SQLException e) {
            log.error("Error while trying to delete producer '{}'", id, e);
        }
    }
}
