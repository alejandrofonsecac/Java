package testesJava.exericicios.SistemaBiblioteca.test;

import testesJava.exericicios.SistemaBiblioteca.dominio.Livro;
import testesJava.exericicios.SistemaBiblioteca.dominio.TipoLivro;
import testesJava.exericicios.SistemaBiblioteca.exception.ItemJaEmprestadoException;
import testesJava.exericicios.SistemaBiblioteca.exception.ItemNaoEmprestadoException;

public class App {
    public static void main(String[] args) throws ItemJaEmprestadoException, ItemNaoEmprestadoException {
        Livro livro = new Livro("Livro de Ciencias", TipoLivro.TIPO_DIDATICO, false);


        livro.setEmprestado(false);

        livro.devolverLivro();
        livro.imprime();
    }
}
