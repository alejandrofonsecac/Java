package test;
import devdojo.orientacaoobjetos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.nome = "Fernando";
        pessoa.idade = 25;
        pessoa.sexo = 'M';

        System.out.println(pessoa.nome);
    }
}
