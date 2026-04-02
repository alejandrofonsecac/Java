package Condicionais;

public class Aula05CondicionalSwitch {
    public static void main(String[] args) {
        byte diaSemana = 4;

        switch (diaSemana){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terca");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Opcao Invalida");
        }

        char sexo = 'M';

        switch (sexo){
            case 'M':
                System.out.println("O sexo e Masculino");
                break;
            case 'F':
                System.out.println("O sexo e Feminino");
                break;
            default:
                System.out.println("Sexo invalido");
            
        }
    }
}
