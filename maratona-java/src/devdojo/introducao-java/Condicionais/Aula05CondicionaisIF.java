package Condicionais;

public class Aula05CondicionaisIF {
    public static void main(String[] args) {
        
        int idade = 15;
        boolean isAutorizadoComprarBebidaAlcoolica = idade >= 18;

        if (isAutorizadoComprarBebidaAlcoolica) {
            System.out.println("Autorizado a comprar bebeida alcoolica! ");
        }

        if(!isAutorizadoComprarBebidaAlcoolica){
            System.out.println("Não autorizado a comprar bebida alcoolica! ");
        }

        //if / else

        float meuSalario = 1535.63F;
        float salarioPadrao = 1570.5F;
        boolean meuSalarioMaiorQueSalarioMinimo = meuSalario >= salarioPadrao;

        if (meuSalarioMaiorQueSalarioMinimo) {
            System.out.println("Meu salario e maior do que um salario minimo. ");
        }else{
            System.out.println("Meu salario nao e maior do que um salario minimo. ");
        }

        //Estrutura de condicionais

        int idadeCategoria = 18;
        String categoria;
        
        if(idadeCategoria < 15){
            categoria ="Categoria Infantil";
        } else if(idadeCategoria >= 15 && idadeCategoria < 18){
            categoria = "Categoria Juvenil";
        } else {
            categoria = "Categoria adulto";
        }

        System.out.println(categoria);
    }
}
