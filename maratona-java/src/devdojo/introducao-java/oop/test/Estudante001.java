package devdojo.orientacaoobjetos.test;
import devdojo.orientacaoobjetos.dominio.Estudante;

public class Estudante001 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();

        estudante.nome = "Jorge";

        System.out.println(estudante.nome);
    }
}
