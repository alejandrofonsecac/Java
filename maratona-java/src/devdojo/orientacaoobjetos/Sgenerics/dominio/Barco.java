package devdojo.orientacaoobjetos.Sgenerics.dominio;

public class Barco {
    private String nome;

    public Barco(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Barro{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
