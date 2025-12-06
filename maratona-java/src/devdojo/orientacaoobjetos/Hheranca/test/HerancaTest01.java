package devdojo.orientacaoobjetos.Hheranca.test;

import devdojo.orientacaoobjetos.Hheranca.dominio.Endereco;
import devdojo.orientacaoobjetos.Hheranca.dominio.Pessoa;
import devdojo.orientacaoobjetos.Hheranca.dominio.Funcionario;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua Curitiba");
        endereco.setCep("12345");

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Fransisco");
        pessoa.setEndereco(endereco);
        pessoa.setCpf("1111111111");
        pessoa.imprime();


        System.out.println("--- Funcionario ---");
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Funcionario Arthur");
        funcionario.setEndereco(endereco);
        funcionario.setCpf("22222222222");
        funcionario.setSalario(2334.21);
        funcionario.imprime();
    }
}
