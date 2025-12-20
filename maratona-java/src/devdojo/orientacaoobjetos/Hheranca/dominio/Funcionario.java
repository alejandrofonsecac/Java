package devdojo.orientacaoobjetos.Hheranca.dominio;

public class Funcionario extends Pessoa {

    private double salario;

    public Funcionario(String nome){
        super(nome);
    }

    public void imprime(){
        super.imprime();
        System.out.println("Aqui a baixo terá o que nao será herdade de Pessoa e ele ée unico de FUNCIONARIO");
        System.out.println(this.salario);
    }

    public void relatorioPagaemento(){
        System.out.println("Eu" + this.nome + " recebo" + this.salario);    
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
