package testesJava.SistemaBiblioteca.exception;

public class ItemJaEmprestadoException extends Exception{
    public ItemJaEmprestadoException(){
        super("Você já possui um livro");
    }

    public ItemJaEmprestadoException(String message) {
        super(message);
    }
}
