package devdojo.orientacaoobjetos.test;
import devdojo.orientacaoobjetos.dominio. CarroInfo;

public class ExercicioCarro {
    public static void main(String[] args) {
        CarroInfo carro = new CarroInfo();

        System.out.println("Nome: " + carro.nome + "\nModelo: " + carro.modeloDoCarro + "\nAno de Lançamento: " + carro.anoDeLancamento);
    }
}
