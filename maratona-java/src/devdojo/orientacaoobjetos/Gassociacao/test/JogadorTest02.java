package devdojo.orientacaoobjetos.Gassociacao.test;

import devdojo.orientacaoobjetos.Gassociacao.dominio.Jogador;
import devdojo.orientacaoobjetos.Gassociacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Time time = new Time("Seleção Brasileira");

        jogador1.setTime(time);
        jogador1.imprimirJogadorTime();
    }
}
