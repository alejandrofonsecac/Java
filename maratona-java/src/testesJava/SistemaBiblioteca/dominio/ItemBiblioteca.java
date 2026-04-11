package testesJava.SistemaBiblioteca.dominio;

import testesJava.SistemaBiblioteca.exception.ItemJaEmprestadoException;
import testesJava.SistemaBiblioteca.exception.ItemNaoEmprestadoException;

public abstract class ItemBiblioteca {
    public String nome;
    public TipoLivro tipoLivro;
    private boolean emprestado;

    public ItemBiblioteca(String nome, TipoLivro tipoLivro, boolean emprestado) {
        this.nome = nome;
        this.tipoLivro = tipoLivro;
        this.emprestado = emprestado;
    }

    public void pegarLivroEmprestado() throws ItemJaEmprestadoException{
        if (emprestado){
            throw new ItemJaEmprestadoException("Item já emprestado");
        }
        emprestado = true;
    }

    public void devolverLivro() throws ItemNaoEmprestadoException{
        if (!emprestado){
            throw new ItemNaoEmprestadoException("Você não possui um livro");
        }
        emprestado = false;
    }

    public void mostrarInfo(){
        System.out.println(this.nome);
        System.out.println(tipoLivro);
        System.out.println(emprestado);
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.tipoLivro);
        System.out.println(emprestado);
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }
}
