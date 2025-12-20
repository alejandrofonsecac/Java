package devdojo.orientacaoobjetos.Hheranca.dominio;

public class Funcionario extends Pessoa {

    private double salario;

    static {
        System.out.println("Dentro do bloco de inicialização estatico dentro de funcionario");
    }// 2

    {
        System.out.println("Dentro do bloco de inicialização de funcionario1");// 6
    }

    {
        System.out.println("Dentro do bloco de inicialização de funcionario2");// 7
    }

    public Funcionario(String nome){
        super(nome);
        System.out.println("Dentr do constructor de funcionario");// 8
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
