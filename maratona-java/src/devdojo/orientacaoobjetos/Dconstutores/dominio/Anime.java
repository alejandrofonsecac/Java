package devdojo.orientacaoobjetos.Dconstutores.dominio;

public class Anime {
    private String nome;
    private String tipo;//Anime, manga...
    private int episodios;
    private String genero;

    public Anime(String nome,  String tipo, int episodios, String genero) {
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
    }

    public Anime(){

    }

    public void imprimir() {
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
    }
}
