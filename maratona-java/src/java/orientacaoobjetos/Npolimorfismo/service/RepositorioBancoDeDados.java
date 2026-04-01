package java.orientacaoobjetos.Npolimorfismo.service;

import java.orientacaoobjetos.Npolimorfismo.dominio.repositorio.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando no Banco de Dados");
    }
}
