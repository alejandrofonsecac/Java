package devdojo.orientacaoobjetos.Gassociacao.test;
import devdojo.orientacaoobjetos.Gassociacao.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé"); // {1}
        Jogador jogador2 = new Jogador("Ronaldo"); // {1}
        Jogador jogador3 = new Jogador("Neymar"); //{1}
        Jogador[] jogadores = {jogador1, jogador2, jogador3}; // {2}

        for (Jogador jogador : jogadores) { // {3}
            jogador.imprimir();
        }
    }
}

// {1} Aqui estamos dizendo que em Jogador (QUE É A REFERÊNCIA) teremos variáveis e estamos gurdando uma informação nessa variável

// {2} Aqui estamos dizendo que a referência JOGADOR vai criar um array que dentro guardara as variáveis que JOGADOR ESTÁ REFERENCIANDO.

// {3} Faz o looping para imprimir todos os valores de JOGADOR