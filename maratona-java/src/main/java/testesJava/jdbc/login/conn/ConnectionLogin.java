package testesJava.jdbc.login.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionLogin {
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3307/exercicios_java";
        String username = "root";
        String password = "root";

        return DriverManager.getConnection(url, username, password);
    }
}
