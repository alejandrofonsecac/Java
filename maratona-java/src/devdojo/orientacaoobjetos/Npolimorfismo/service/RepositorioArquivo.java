package devdojo.orientacaoobjetos.Npolimorfismo.service;

import devdojo.orientacaoobjetos.Npolimorfismo.dominio.repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em um arquivo");
    }
}
