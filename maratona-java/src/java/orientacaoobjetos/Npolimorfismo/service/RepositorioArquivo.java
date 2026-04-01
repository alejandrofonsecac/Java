package java.orientacaoobjetos.Npolimorfismo.service;

import java.orientacaoobjetos.Npolimorfismo.dominio.repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em um arquivo");
    }
}
