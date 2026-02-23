package devdojo.orientacaoobjetos.ClassesUtilitarias.ResourceBundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest01 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        ResourceBundle bundle = ResourceBundle.getBundle("mensagem", new Locale("en", "US"));
        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("good.morning"));
        System.out.println(bundle.getString("hi"));


        bundle = ResourceBundle.getBundle("mensagem", new Locale("pt", "BR"));
        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("good.morning"));



        //=== A sequencia de aonde sistema procura a chavee se dar erro ===
        // Locale("fr", "CA")
        //mensagem_fr_CA.properties
        //mensagem_fr.properties
        //mensagem_en_US.properties
        //mensagem_en.properties
        //mensagem.properties
        // Lança exceção

        System.out.println(bundle.getString("hi"));
    }
}
