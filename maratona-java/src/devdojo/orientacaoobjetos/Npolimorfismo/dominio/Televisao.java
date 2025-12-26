package devdojo.orientacaoobjetos.Npolimorfismo.dominio;

public class Televisao extends Produto{
    public static final double IMPOSTO = 0.17;

    public Televisao(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto da televisao: ");
        return this.valor * IMPOSTO;
    }
}
