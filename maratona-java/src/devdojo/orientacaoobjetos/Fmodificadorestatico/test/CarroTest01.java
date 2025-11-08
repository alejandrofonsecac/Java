package devdojo.orientacaoobjetos.Fmodificadorestatico.test;
import devdojo.orientacaoobjetos.Fmodificadorestatico.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Mercedes", 275);
        Carro c3 = new Carro("Audi", 270);

        Carro.velocidadeLimite = 180;

        c1.imprimir();
        c2.imprimir();
        c3.imprimir();
    }
}