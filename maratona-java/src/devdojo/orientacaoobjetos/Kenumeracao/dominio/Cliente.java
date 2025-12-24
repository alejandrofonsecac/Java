package devdojo.orientacaoobjetos.Kenumeracao.dominio;

public class Cliente {


    private String nome;
    private TipoCliente tipoCliente;
    private  TipoPagamento TipoPagamento;

    public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento TipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        TipoPagamento = TipoPagamento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente.getNomeRelatorio() +
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

    public TipoPagamento getTipoPagamento() {
        return TipoPagamento;
    }

    public void setTipoPagamento(TipoPagamento tipoPagamento) {
        TipoPagamento = tipoPagamento;
    }
}
