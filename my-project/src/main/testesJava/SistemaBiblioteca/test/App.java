package testesJava.SistemaBiblioteca.test;

import testesJava.SistemaBiblioteca.dominio.Livro;
import testesJava.SistemaBiblioteca.dominio.TipoLivro;
import testesJava.SistemaBiblioteca.exception.ItemJaEmprestadoException;
import testesJava.SistemaBiblioteca.exception.ItemNaoEmprestadoException;

public class App {
    public static void main(String[] args) throws ItemJaEmprestadoException, ItemNaoEmprestadoException {
        Livro livro = new Livro("Livro de Ciencias", TipoLivro.TIPO_DIDATICO, false);


        livro.setEmprestado(false);

        livro.devolverLivro();
        livro.imprime();
    }
}
