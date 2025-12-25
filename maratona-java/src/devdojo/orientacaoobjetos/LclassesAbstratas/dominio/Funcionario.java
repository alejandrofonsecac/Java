package devdojo.orientacaoobjetos.LclassesAbstratas.dominio;

public abstract class Funcionario extends Pessoa {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calculaBonus();
    }

    @Override
    public void imprime() {
        System.out.println("Imprimindo...");
        // Agora que a classe mae Funcioanrio tem o metodo herdado de PESSOA, gerente e desenvolvedor herdaram esse metodo e nao dara mais erro
    }

    public abstract void calculaBonus();
}
