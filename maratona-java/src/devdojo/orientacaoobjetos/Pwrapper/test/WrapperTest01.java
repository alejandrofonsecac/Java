package devdojo.orientacaoobjetos.Pwrapper.test;

public class WrapperTest01 {
    public static void main(String[] args) {
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10L;
        float floatP = 10F;
        double doubleP = 10D;
        char charP = 'a';
        boolean booleanP = false;

        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 1; // Autoboxing (conversão automatica de um tipo primitivo para Wrapper )
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 10D;
        Character charW = 'a';
        Boolean booleanW = false;

        int i = intW; // unboxing (tranformar Wrapper para tipo primitivo)
        Integer intW2 = Integer.parseInt("1");  // Tranformar string em int => Interger
        boolean verdadeiro = Boolean.parseBoolean("true");
        System.out.println(verdadeiro);

        System.out.println("--- Testes com o Character ---");
        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isDigit('a'));
        System.out.println(Character.isUpperCase('a'));
        System.out.println(Character.isLowerCase('v'));

        System.out.println(Character.toUpperCase('a'));

    }
}
