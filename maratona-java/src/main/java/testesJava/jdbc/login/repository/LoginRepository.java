package testesJava.jdbc.login.repository;

import lombok.extern.log4j.Log4j2;
import testesJava.jdbc.login.conn.ConnectionLogin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Log4j2
public class LoginRepository {
    public static boolean Register(String name, String password) throws SQLException {
        String sql = "INSERT INTO exercicios_java.login (name, password) VALUES (?, ?)";

        try(Connection conn = ConnectionLogin.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setString(1, name);
            ps.setString(2, password);
            int rowsAffected = ps.executeUpdate();
            log.info("Update user , rows affected '{}'", rowsAffected);
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao registrar usuario", e);
        }
        return false;
    }

    public static boolean Login(String name, String password){
        String sql = "SELECT * FROM exercicios_java.login WHERE name = ? AND password = ?";

        try(Connection conn = ConnectionLogin.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, name);
            ps.setString(2, password);

            try(ResultSet rs = ps.executeQuery()) {
                return rs.next();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
