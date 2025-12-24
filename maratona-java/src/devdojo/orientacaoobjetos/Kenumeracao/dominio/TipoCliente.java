package devdojo.orientacaoobjetos.Kenumeracao.dominio;

public enum TipoCliente {
    PESSOA_FISICA(1, "PESSOA FISICA"),
    PESSOA_JURIDICA(2, "PESSOA JURIDICA");

    private final int VALOR;
    private final String nomeRelatorio;

    TipoCliente(int valor, String nomeRelatorio){
        this.VALOR = valor;
        this.nomeRelatorio = nomeRelatorio;
    }

    public static TipoCliente tipoClientePorNomeRelatorio(String nomeRelatorio) {
        for (TipoCliente tipoCliente : values()){
            if(tipoCliente.getNomeRelatorio().equals(nomeRelatorio)){
                return tipoCliente;
            }
        }
        return null;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }

    public int getValor() {
        return VALOR;
    }
}
