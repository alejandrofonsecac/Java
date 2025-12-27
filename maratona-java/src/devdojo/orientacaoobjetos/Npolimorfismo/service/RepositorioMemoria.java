package devdojo.orientacaoobjetos.Npolimorfismo.service;

import devdojo.orientacaoobjetos.Npolimorfismo.dominio.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em memoria");
    }
}
