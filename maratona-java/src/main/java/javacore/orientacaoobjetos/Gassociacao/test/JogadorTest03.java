package javacore.orientacaoobjetos.Gassociacao.test;
import javacore.orientacaoobjetos.Gassociacao.dominio.Jogador;
import javacore.orientacaoobjetos.Gassociacao.dominio.Time;


public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Cafu");
        Jogador jogador2 = new Jogador("Yamal");

        Time time = new Time("Brasil");
        Time time2 = new Time("Santos");

        Jogador[] jogadores = {jogador, jogador2};

        jogador.setTime(time);
        jogador2.setTime(time2);

        time.setJogadores(jogadores);

        System.out.println("---Jogador---");
        for(Jogador jogador1 : jogadores){
            jogador1.imprimirJogadorTime();
        }

        System.out.println("---Time---");
        time.imprime();
    }
}
