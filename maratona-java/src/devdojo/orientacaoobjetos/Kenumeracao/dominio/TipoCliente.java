package devdojo.orientacaoobjetos.Kenumeracao.dominio;

public enum TipoCliente {
    PESSOA_FISICA(1),
    PESSOA_JURIDICA(2);

    private final int VALOR;

    TipoCliente(int valor){
        this.VALOR = valor;
    }

    public int getValor() {
        return VALOR;
    }
}
