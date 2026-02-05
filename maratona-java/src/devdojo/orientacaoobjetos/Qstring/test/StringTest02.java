package devdojo.orientacaoobjetos.Qstring.test;

public class StringTest02 {
    public static void main(String[] args) {
        String nome = "    Joao   ";
        String numeros = "0123456";

        System.out.println(nome.charAt(0));
        System.out.println(nome.length());
        System.out.println(nome.replace("J", "L"));
        System.out.println(nome.toUpperCase());
        System.out.println(nome.toLowerCase());
        System.out.println(nome.trim()); // Tira os espaços da String
        System.out.println("------");
        System.out.println(numeros.length());
        System.out.println(numeros.substring(0, 4)); // Retorna os itens da posição 0 até a 4
        System.out.println(numeros.substring(3, numeros.length())); // Podemos colocar apenas o 3 que o Java entende que queremos da posição 3 até o final

    }
}
