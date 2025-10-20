package devdojo.orientacaoobjetos.test;
import devdojo.orientacaoobjetos.dominio.Estudante;

public class PessoaTest01 {
    public static void main(String[] args) {
        Estudante pessoa = new Estudante();

        pessoa.nome = "Fernando";
        pessoa.idade = 25;
        pessoa.sexo = 'M';

        System.out.println(pessoa.nome);
        System.out.println(pessoa.idade);
    }
}