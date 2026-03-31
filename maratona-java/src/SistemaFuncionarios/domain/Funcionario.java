package SistemaFuncionarios.domain;

import java.util.Objects;

public class Funcionario {
    private String nome;
    private int idade;
    private double salario;
    private Cargos cargos;

    public Funcionario(String nome, int idade, double salario, Cargos cargos) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        this.cargos = cargos;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Funcionario that = (Funcionario) o;
        return idade == that.idade && Double.compare(salario, that.salario) == 0 && Objects.equals(nome, that.nome) && cargos == that.cargos;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, idade, salario, cargos);
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", salario=" + salario +
                ", cargos=" + cargos +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cargos getCargos() {
        return cargos;
    }

    public void setCargos(Cargos cargos) {
        this.cargos = cargos;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
