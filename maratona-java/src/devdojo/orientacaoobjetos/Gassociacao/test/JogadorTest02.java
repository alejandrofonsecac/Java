package devdojo.orientacaoobjetos.Gassociacao.test;

import devdojo.orientacaoobjetos.Gassociacao.dominio.Jogador;
import devdojo.orientacaoobjetos.Gassociacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé"); // {1}
        Jogador jogador2 = new Jogador("Maria"); // {1}
        Time time = new Time("Seleção Brasileira"); //{2}
        Jogador [] jogadores = {jogador1,jogador2};// {3}

        jogador1.setTime(time); //{4}
        jogador2.setTime(time); //{4}

        for (Jogador jogador : jogadores) { //{5}
            jogador.imprimirJogadorTime();
        }
    }
}

//{1} Aqui criamos os jogadores e usamos JOGADOR como referência (ASSOCIAÇÃO)
//{2} Aqui criamos time usamos Time como referência e damos o valor a time
//{3} A referência JOGADOR é um array o qual guarda jogador1 e 2.
//{4} Dizemos que cada jogador usa (time) como referência, ou seja, setamos para que cada jogador seja de time x.
//{5} Imprimimos os jogadores e seus times.
