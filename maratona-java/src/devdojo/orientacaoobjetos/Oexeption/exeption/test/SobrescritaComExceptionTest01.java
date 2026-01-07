package devdojo.orientacaoobjetos.Oexeption.exeption.test;

import devdojo.orientacaoobjetos.Oexeption.exeption.dominio.Funcionario;
import devdojo.orientacaoobjetos.Oexeption.exeption.dominio.LoginInvalidoException;
import devdojo.orientacaoobjetos.Oexeption.exeption.dominio.Pessoa;

import java.io.FileNotFoundException;

public class SobrescritaComExceptionTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            funcionario.salvar();
        } catch (LoginInvalidoException | FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
