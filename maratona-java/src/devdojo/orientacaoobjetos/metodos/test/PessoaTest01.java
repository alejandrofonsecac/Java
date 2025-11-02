package devdojo.orientacaoobjetos.metodos.test;

import devdojo.orientacaoobjetos.metodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Pedro");
        pessoa.setIdade(30);

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
