package devdojo.orientacaoobjetos.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {

        // String são imutaveis

        String nome = "Jorge"; // String constant pool
        String nome2 = "Jorge";

        System.out.println(nome == nome2);  //True //verificando se as referencias fazem referencia ao mesmo valor

        nome.concat(" Alejandro");
        System.out.println(nome);
        System.out.println(nome.concat(" Alejandro"));
        nome = nome.concat(" Alejandro");
        System.out.println(nome);

        System.out.println("----------");

        String nome3 = new String("Jorge"); // 1 variael de referencia, 2 objeto do tipo String, 3 string no pool de string
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());
    }
}
