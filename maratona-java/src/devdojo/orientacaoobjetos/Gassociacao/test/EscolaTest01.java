package devdojo.orientacaoobjetos.Gassociacao.test;

import devdojo.orientacaoobjetos.Gassociacao.dominio.Escola;
import devdojo.orientacaoobjetos.Gassociacao.dominio.Professor;
import testesJava.mercadoProdutos.dominio.Produtos;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Alejandro");
        Professor professor2 = new Professor("Fonseca");
        Professor[] professores = {professor1, professor2};
        Escola escola = new Escola("Suplicy", professores);//{1}

        escola.imprime();//{2}
    }
}

//{1} Puxa o metodo que terá o constructor dentro que lá dentro puxara o nome que seta passado atraves de PROFESSOR

//{2} Exibe no no imprime os professores que a escola terá
