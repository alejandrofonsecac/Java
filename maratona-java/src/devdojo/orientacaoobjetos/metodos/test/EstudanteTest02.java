package devdojo.orientacaoobjetos.metodos.test;

import devdojo.orientacaoobjetos.metodos.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {

        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante.nome = "Fernando";
        estudante.idade = 20;
        estudante.sexo = 'M';

        estudante2.nome = "Maria";
        estudante2.idade = 21;
        estudante2.sexo = 'F';


        estudante.imprimi();
        System.out.println("-------");
        estudante2.imprimi();
    }
}
