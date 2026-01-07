package testesJava.SistemaBiblioteca.exception;

public class ItemNaoEmprestadoException extends Exception{
    public ItemNaoEmprestadoException(){
        super("Você não possui um livro");

    }

    public ItemNaoEmprestadoException(String message){
        super(message);
    }
}
