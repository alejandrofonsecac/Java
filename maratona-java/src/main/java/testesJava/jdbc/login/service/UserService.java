package testesJava.jdbc.login.service;

import testesJava.jdbc.login.domain.User;
import testesJava.jdbc.login.repository.LoginRepository;

import java.sql.SQLException;

public class UserService{
    public static boolean login(String name, String password){
        PasswordIsValid(password);
        return LoginRepository.Login(name, password);
    }

    public static boolean register(String name, String password) throws SQLException {
        PasswordIsValid(password);

        return LoginRepository.Register(name, password);
    }

    public static void PasswordIsValid(String password){
        if (password.isEmpty()){
            System.out.println("Argumento Invalido");
        }
    }
}
