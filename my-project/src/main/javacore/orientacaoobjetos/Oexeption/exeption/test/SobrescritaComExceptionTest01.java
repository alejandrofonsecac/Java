package javacore.orientacaoobjetos.Oexeption.exeption.test;

import javacore.orientacaoobjetos.Oexeption.exeption.dominio.Funcionario;
import javacore.orientacaoobjetos.Oexeption.exeption.dominio.LoginInvalidoException;
import javacore.orientacaoobjetos.Oexeption.exeption.dominio.Pessoa;

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
