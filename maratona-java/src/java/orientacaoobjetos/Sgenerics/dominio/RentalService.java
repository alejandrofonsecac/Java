package java.orientacaoobjetos.Sgenerics.dominio;

import java.util.List;

public class RentalService<T> {
    private List<T> objetosDisponiveis;

    public  RentalService(List<T> objetosDisponiveis){
        this.objetosDisponiveis = objetosDisponiveis;
    }

    public T buscarCarroDisponivel(){
        System.out.println("Buscando por objeto disponivel");
        T t = objetosDisponiveis.remove(0);
        System.out.println("Alugando carro: " + t);
        System.out.println("Objetos disponiveis para alugar");
        System.out.println(t);
        return t;
    }

    public void retornarObjetoAlugado(T t){
        System.out.println("Devolvendo carro " + t);
        objetosDisponiveis.add(t);
        System.out.println("Carros disponiveis para aluagar:");
        System.out.println(t);
    }
}
