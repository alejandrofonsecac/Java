package testesJava.SistemaDeControleDeVeiculos.dominio;

import devdojo.orientacaoobjetos.Npolimorfismo.dominio.Tomate;

public abstract class Veiculo implements Manutencao {
    protected String nome;
    protected TipoVeiculo tipoVeiculo;
    protected int dataDeFabricacao;
    protected double valor;
    protected int kilometragem;

    public int anoAtual = 2025;
    public int idadeVeiculo;

    public Veiculo(String nome, TipoVeiculo tipoVeiculo, int dataDeFabricacao, double valor) {
        this.nome = nome;
        this.tipoVeiculo = tipoVeiculo;
        this.dataDeFabricacao = dataDeFabricacao;
        this.valor = valor;
    }

    public void exibirDetalhes(Veiculo veiculo){
        System.out.println("Detalhes sobre o veiculo: ");
        System.out.println(veiculo.getTipoVeiculo());
        System.out.println("Nome: " + veiculo.getNome());
        System.out.println("Data de lançamento " + veiculo.getdataDeFabricacao());
        System.out.println("Valor: " + veiculo.getValor());
        System.out.println("===================");
        System.out.println("A idade atual do veiculo é de: " + veiculo.calcularIdade());
    }

    public int calcularIdade() {
        int anoAtual = 2025;
        return anoAtual - dataDeFabricacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoVeiculo getTipoVeiculo() {
        return tipoVeiculo;
    }

    public void setTipoVeiculo(TipoVeiculo tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    public int getdataDeFabricacao() {
        return dataDeFabricacao;
    }

    public void setdataDeFabricacao(int dataDeFabricacao) {
        this.dataDeFabricacao = dataDeFabricacao;
    }

    public int getAnoAtual() {
        return anoAtual;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
