package devdojo.orientacaoobjetos.Fmodificadorestatico.dominio;

public class Carro {
    private String nome;
    private double velocidadeMax;
    public static double velocidadeLimite = 250;
    //Com o modificador static significa que todos os
    // objetos irao receber o mesmo valor
    // ...E que a variavel pertence a esta classe

    public void imprimir(){
        System.out.println("---------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Velocidade max: " + this.velocidadeMax);
        System.out.println("Velocidade limite: " + Carro.velocidadeLimite);
    }

    public Carro(String nome, double velocidadeMax) {
        this.nome = nome;
        this.velocidadeMax = velocidadeMax;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMax() {
        return velocidadeMax;
    }

    public void setVelocidadeMax(double velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }

    public double getVelocidadeLimite(){
        return velocidadeLimite;
    }

    public void setVelocidadeLimite(double velocidadeLimite){
        this.velocidadeLimite = velocidadeLimite;
    }

}


