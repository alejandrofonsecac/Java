package java.orientacaoobjetos.ClassesUtilitarias.regex.test;

public class ScannerTest01 {
    public static void main(String[] args) {
        // Neste caso os tokens são os nome e delimitadores a ,

        String text = "Jorge,Arthur, Joao";
        String[] nomes = text.split(",");// Usado para ser o delimitador
        for (String nome : nomes){
            System.out.println(nome.trim());
        }
    }
}
