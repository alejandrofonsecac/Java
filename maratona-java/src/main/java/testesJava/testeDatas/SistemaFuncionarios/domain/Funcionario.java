package testesJava.testeDatas.SistemaFuncionarios.domain;

import java.util.List;
import java.util.Objects;

public class Funcionario {
    private String nome;
    private int idade;
    private double salario;
    private Cargos cargos;
    private List<Habilidades> habilidades;

    public Funcionario(String nome, int idade, double salario, Cargos cargos) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        this.cargos = cargos;
    }

    public Funcionario(String nome, int idade, double salario, Cargos cargos, List<Habilidades> habilidades) {
        this.nome = nome;
        this.habilidades = habilidades;
        this.cargos = cargos;
        this.salario = salario;
        this.idade = idade;
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
                ", habilidades=" + habilidades +
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

    public List<Habilidades> getHabilidades() { return habilidades; }
}
