package devdojo.orientacaoobjetos.Npolimorfismo.test;

import devdojo.orientacaoobjetos.Npolimorfismo.dominio.repositorio.Repositorio;
import devdojo.orientacaoobjetos.Npolimorfismo.service.RepositorioBancoDeDados;

public class RepositorioTest {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioBancoDeDados();
        repositorio.salvar();
    }
}
