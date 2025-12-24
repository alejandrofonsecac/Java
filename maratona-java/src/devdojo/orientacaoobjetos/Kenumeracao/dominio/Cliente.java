package devdojo.orientacaoobjetos.Kenumeracao.dominio;

public class Cliente {
    public enum TipoPagammento{ // Enumeração dentro de uma classe
        DEBITO,
        CREDITO
    }

    private String nome;
    private TipoCliente tipoCliente;
    private  TipoPagammento TipoPagamento;

    public Cliente(String nome, TipoCliente tipoCliente, TipoPagammento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        TipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente.getValor() +
                ", TipoPagamento=" + TipoPagamento +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public TipoPagammento getTipoPagamento() {
        return TipoPagamento;
    }

    public void setTipoPagamento(TipoPagammento tipoPagamento) {
        TipoPagamento = tipoPagamento;
    }
}
