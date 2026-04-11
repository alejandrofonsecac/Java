package testesJava.SistemaBiblioteca.dominio;

public class Livro extends ItemBiblioteca{
    private String autor;
    private int dataLancamento;

    public Livro(String nome, TipoLivro tipoLivro, boolean emprestado) {
        super(nome, tipoLivro, emprestado);
    }
}
