package javacore.orientacaoobjetos.Npolimorfismo.test;

import javacore.orientacaoobjetos.Npolimorfismo.dominio.repositorio.Repositorio;
import javacore.orientacaoobjetos.Npolimorfismo.service.RepositorioBancoDeDados;

public class RepositorioTest {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioBancoDeDados();
        repositorio.salvar(); //Programação orientada a Interfaces
    }
}
