package Biblioteca_Manga.dominio;

public class Manga {
    private Long id;
    private String nome;
    private double preco;
    public Categorias categorias;


    public Manga(String nome, double preco, Categorias categoriaSelecionada) {
        this.nome = nome;
        this.preco = preco;
        this.categorias = categoriaSelecionada;
    }

    public Manga(Long id, String nome, double preco, Categorias categorias) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.categorias = categorias;
    }

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", categorias=" + categorias +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
