package devdojo.orientacaoobjetos.Npolimorfismo.service;

import devdojo.orientacaoobjetos.Npolimorfismo.dominio.repositorio.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando no Banco de Dados");
    }
}
