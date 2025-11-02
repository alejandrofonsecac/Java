package devdojo.orientacaoobjetos.Bmetodos.test;
import devdojo.orientacaoobjetos.Bmetodos.dominio.Estudante;
import devdojo.orientacaoobjetos.Bmetodos.dominio.impressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();
        impressoraEstudante impressora = new impressoraEstudante();

        estudante.nome = "Fernando";
        estudante.idade = 20;
        estudante.sexo = 'M';

        estudante2.nome = "Maria";
        estudante2.idade = 21;
        estudante2.sexo = 'F';

        impressora.imprime(estudante);
        impressora.imprime(estudante2);
    }
}
