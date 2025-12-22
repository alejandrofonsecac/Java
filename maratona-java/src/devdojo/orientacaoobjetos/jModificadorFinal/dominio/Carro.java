package devdojo.orientacaoobjetos.jModificadorFinal.dominio;

public class Carro { //Podemoos usar FINAL para nao permitir extensoes de classe
    private String nome;
    public static final double VELOCIDADE_LIMITE = 250;
    public final Comprador COMPRADOR = new Comprador();

    public final void imprime(){
        System.out.println(this.nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
