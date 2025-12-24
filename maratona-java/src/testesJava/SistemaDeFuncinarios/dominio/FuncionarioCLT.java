package testesJava.SistemaDeFuncinarios.dominio;

public class FuncionarioCLT extends Funcionario{
    private double horasExtras;
    private double salarioComHorasExtras;

    public FuncionarioCLT(String nome, double salario, Departamento departamento){
        super(nome, salario, departamento);
    }

    @Override
    public void imprimirFuncionario() {
        super.imprimirFuncionario();
        salarioComHorasExtras = getSalario() + horasExtras * 50;
        System.out.println("Horas extras: " + this.horasExtras);
        System.out.print("Salario com horas  extras: ");
        System.out.println(salarioComHorasExtras);
    }

    public double getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(double horasExtras) {
        this.horasExtras = horasExtras;
    }
}
