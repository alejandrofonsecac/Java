package devdojo.orientacaoobjetos.SobreCargaDeMetodos.dominio;

public class Anime {
    private String nome;
    private String tipo;//Anime, manga...
    private int episodios;
    private String genero;


    public void imprimir() {
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
    }

    public void init(String nome, String tipo, int episodios) {
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
    }

    public void init(String nome, String tipo, int episodios, String genero) {
        this.init(nome, tipo, episodios);
        this.genero = genero;
    }

}
