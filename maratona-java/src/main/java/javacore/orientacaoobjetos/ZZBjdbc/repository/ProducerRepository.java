package javacore.orientacaoobjetos.ZZBjdbc.repository;

import javacore.orientacaoobjetos.ZZBjdbc.conn.ConnectionFactory;
import javacore.orientacaoobjetos.ZZBjdbc.dominio.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

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
            log.info("Inserted producer '{}' in the data base, rows affected {}", producer.getName(), rowsAffected);
        } catch (SQLException e) {
            log.error("Error while trying to insert producer '{}'", producer.getName(), e);
        }
    }
    //DELETE FROM `anime_store`.`producer` WHERE (`id` = '13');

    public static void delete(int id) {
        String sql = "DELETE FROM anime_store.producer WHERE id = ?";
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)){

            ps.setInt(1, id);
            int rowsAffected = ps.executeUpdate();

        } catch (SQLException e) {
            log.error("Error while trying to delete producer '{}'", id, e);
        }
    }

    public static List<Producer> findAll() {
        log.info("Finding all Producers");
        String sql = "SELECT id, name FROM anime_store.producer";
        List<Producer> producers = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery(sql)) {
            while (rs.next()){
                Producer producer = Producer
                        .builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .build();
                producers.add(producer);
            }

        } catch (SQLException e) {
            log.error("Error while trying to find all producers", e);
        }
        return producers;
    }

    //% significa:
    //Ex:
    //%naruto% → contém "naruto"
    //naruto% → começa com
    //%naruto → termina com

    public static List<Producer> findByName(String name) {
        log.info("Finding all Producers names");
        String sql = "SELECT * FROM anime_store.producer where name like ?";
        List<Producer> producers = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)){
             ps.setString(1, "% " + name + " %");
             ResultSet rs = ps.executeQuery();
            while (rs.next()){
                Producer producer = Producer
                        .builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .build();
                producers.add(producer);
            }

        } catch (SQLException e) {
            log.error("Error while trying to find all producers", e);
        }
        return producers;
    }

    public static void showProducerMetaData() {
        log.info("Showing Producer MetaData");
        String sql = "SELECT * FROM anime_store.producer";
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)){
            ResultSet rs = ps.executeQuery();

            ResultSetMetaData rsMetaData = rs.getMetaData();
            rs.next();
            int columnCount = rsMetaData.getColumnCount();
            log.info("Columns count '{}'", columnCount);
            for (int i = 1; i <=  columnCount; i++) {
                log.info("Table name '{}'", rsMetaData.getTableName((i)));
                log.info("Column name '{}'", rsMetaData.getColumnName(i));
                log.info("Column size '{}'", rsMetaData.getColumnDisplaySize(i));
                log.info("Colums type '{}'", rsMetaData.getColumnTypeName(i));
            }
        } catch (SQLException e) {
            log.error("Error while trying to find all producers", e);
        }
    }

    public static void showDriverMetaData() {
        log.info("Showing Driver MetaData");
        String sql = "SELECT * FROM anime_store.producer";

        try (Connection conn = ConnectionFactory.getConnection()){
            DatabaseMetaData dbMetaData = conn.getMetaData();
            if(dbMetaData.supportsResultSetType(ResultSet.TYPE_FORWARD_ONLY)){
                log.info("Supports TYPE_FORWARD_ONLY");
                if (dbMetaData.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE)){
                    log.info("And supports CONCUR_UPDATABLE");
                }
            }

            if(dbMetaData.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE)){
                log.info("Supports TYPE_SCROLL_INSENSITIVE");
                if (dbMetaData.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE)){
                    log.info("And supports CONCUR_UPDATABLE");
                }
            }

            if(dbMetaData.supportsResultSetType(ResultSet.TYPE_SCROLL_SENSITIVE)){
                log.info("Supports TYPE_FORWARD_ONLY");
                if (dbMetaData.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE)){
                    log.info("And supports CONCUR_UPDATABLE");
                }
            }

        } catch (SQLException e) {
            log.error("Error while trying to find all producers", e);
        }
    }

    public static void showTypeScrollWorking() {
        String sql = "SELECT * FROM anime_store.producer order by name desc";
        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = stmt.executeQuery(sql)){

            log.info("Last row? '{}'", rs.last());
            log.info("Row number '{}'", rs.getRow());
            log.info(Producer.builder().id(rs.getInt("id")).name(rs.getString("name")).build());

            log.info("=========");

            log.info("First row? '{}'", rs.first());
            log.info("Row number '{}'", rs.getRow());
            log.info(Producer.builder().id(rs.getInt("id")).name(rs.getString("name")).build());

            log.info("==========");

            log.info("Row Absolute '{}'", rs.absolute(2));
            log.info("Row number '{}'", rs.getRow());
            log.info(Producer.builder().id(rs.getInt("id")).name(rs.getString("name")).build());

            log.info("========");

            log.info("Row Relative ? '{}'", rs.relative(-1));
            log.info("Row number '{}'", rs.getRow());
            log.info(Producer.builder().id(rs.getInt("id")).name(rs.getString("name")).build());

            log.info("========");

            log.info("is last ? '{}'", rs.isLast());
            log.info("Row number '{}'", rs.getRow());

            System.out.println("=======");

            log.info("is first ? '{}'", rs.isFirst());
            log.info("Row number '{}'", rs.getRow());

            log.info("========");

            log.info("Last row? '{}'", rs.last());
            log.info("---------");

            rs.isAfterLast();
            log.info("After last row? '{}'", rs.isAfterLast());

            while (rs.previous()){
                log.info(Producer.builder().id(rs.getInt("id")).name(rs.getString("name")).build());
            }
        } catch (SQLException e) {
            log.error("Error while trying to find all producers", e);
        }
    }
}