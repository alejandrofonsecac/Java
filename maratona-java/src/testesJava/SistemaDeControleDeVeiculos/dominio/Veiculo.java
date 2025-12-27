package testesJava.SistemaDeControleDeVeiculos.dominio;

public abstract class Veiculo implements Manutencao {
    protected String nome;
    protected TipoVeiculo tipoVeiculo;
    protected int dataDeFabricacao;
    protected double valor;

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
        System.out.println(this.getTipoVeiculo());
        System.out.println("Nome: " + this.getNome());
        System.out.println("Data de lançamento " + this.getdataDeFabricacao());
        System.out.println("Valor: " + this.getValor());
        System.out.println("===================");
    }

    public void calcularIdadeVeiculo(){
        idadeVeiculo = anoAtual - dataDeFabricacao;
        System.out.println("Idade do Veiculo: " + this.idadeVeiculo + " anos") ;
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

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
