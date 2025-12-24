package testesJava.SistemaDeFuncinarios.dominio;

public class Funcionario {
    protected String nome;
    protected double Salario;
    protected Departamento departamento;

    private Funcionario[] funcionarios;

    public Funcionario(String nome, double salario, Departamento departamento) {
        this.nome = nome;
        this.Salario = salario;
        this.departamento = departamento;
    }

    public void imprimirFuncionario(){
            System.out.println(this.getNome());
            System.out.println(this.getSalario());
            System.out.println(this.getDepartamento());
            System.out.println("---------------");
    }

    public void imprimirFuncionarios(){
        if (this.funcionarios == null) return;

        for (Funcionario f : this.funcionarios) {
            System.out.println("Nome:" + f.getNome());
            System.out.println("Salario:" + f.getSalario());
            System.out.println("Departamento:" + f.getDepartamento());
            System.out.println("---------------");
        }
    }

    //Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double salario) {
        Salario = salario;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public Funcionario[] getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(Funcionario[] funcionarios) {
        this.funcionarios = funcionarios;
    }
}
