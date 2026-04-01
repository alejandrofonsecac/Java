package java.orientacaoobjetos.Npolimorfismo.test;

import java.orientacaoobjetos.Npolimorfismo.dominio.repositorio.Repositorio;
import java.orientacaoobjetos.Npolimorfismo.service.RepositorioBancoDeDados;

public class RepositorioTest {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioBancoDeDados();
        repositorio.salvar(); //Programação orientada a Interfaces
    }
}
