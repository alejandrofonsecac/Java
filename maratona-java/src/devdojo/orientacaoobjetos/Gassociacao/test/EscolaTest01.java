package devdojo.orientacaoobjetos.Gassociacao.test;

import devdojo.orientacaoobjetos.Gassociacao.dominio.Escola;
import devdojo.orientacaoobjetos.Gassociacao.dominio.Professor;
import testesJava.mercadoProdutos.dominio.Produtos;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Alejandro"); // {1}
        Professor professor2 = new Professor("Fonseca"); // {1}
        Professor[] professores = {professor1, professor2}; // {2}
        Escola escola = new Escola("Suplicy", professores);//{3}

        escola.imprime();//{4}
    }
}

