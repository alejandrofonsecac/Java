package devdojo.orientacaoobjetos.Rcolecoes.dominio;

import java.util.Objects;

import static java.lang.Long.compare;

public class Manga implements  Comparable<Manga>{
    private Long id;
    private String nome;
    private double preco;

    public Manga(Long id, String nome, double preco) {
        Objects.requireNonNull(id, "Id não pode ser nulo");
        Objects.requireNonNull(nome, "Nome não pode ser nulo");
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Manga manga = (Manga) o;
        return Double.compare(preco, manga.preco) == 0 && Objects.equals(id, manga.id) && Objects.equals(nome, manga.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, preco);
    }

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    @Override
    public int compareTo(Manga outroManga) {
        int resultado = compare(this.id, outroManga.id);
        //Long
        // resultado < preco -> 1
        // resltado == preco -> 0
        // resultado > preco -> -1

        if (resultado != 0){
            return resultado;
            //Se o preco for diferente retorna a comparacao de preco, se ele for igual vai para a linha de baixo e compara pelo nome
        }

        return this.nome.compareTo(outroManga.getNome());
    }
}
