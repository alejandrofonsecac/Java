package java.orientacaoobjetos.Gassociacao.test;

import java.orientacaoobjetos.Gassociacao.dominio.Escola;
import java.orientacaoobjetos.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Alejandro"); // {1}
        Professor professor2 = new Professor("Fonseca"); // {1}
        Professor[] professores = {professor1, professor2}; // {2}
        Escola escola = new Escola("Suplicy", professores);//{3}

        escola.imprime();//{4}
    }
}

