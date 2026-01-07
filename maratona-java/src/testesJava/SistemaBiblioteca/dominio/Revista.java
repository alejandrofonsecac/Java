package testesJava.SistemaBiblioteca.dominio;

public class Revista extends ItemBiblioteca{
    public String autor;
    public int dataLancamento;

    public Revista(String nome, TipoLivro tipoLivro, boolean emprestado) {
        super(nome, tipoLivro, emprestado);
    }
}
