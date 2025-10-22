package devdojo.orientacaoobjetos.test;
import devdojo.orientacaoobjetos.dominio. CarroInfo;

public class ExercicioCarro {
    public static void main(String[] args) {
        CarroInfo carro = new CarroInfo();
        CarroInfo carro2 = new CarroInfo();

        carro2.nome = "BMW";
        carro2.modeloDoCarro = "M4 GT3";
        carro2.anoDeLancamento = 2021;

        System.out.println("Nome: " + carro.nome + "\nModelo: " + carro.modeloDoCarro + "\nAno de Lançamento: " + carro.anoDeLancamento);
        System.out.println("\n\nNome: " + carro2.nome + "\nModelo: " + carro2.modeloDoCarro + "\nAno de Lançamento: " + carro2.anoDeLancamento);


        //Referencia de Objetos

        carro = carro2;
        System.out.println("\n\nNome: " + carro.nome + "\nModelo: " + carro.modeloDoCarro + "\nAno de Lançamento: " + carro.anoDeLancamento);
    }
}
