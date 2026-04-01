package java.orientacaoobjetos.Npolimorfismo.service;

import java.orientacaoobjetos.Npolimorfismo.dominio.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em memoria");
    }
}
