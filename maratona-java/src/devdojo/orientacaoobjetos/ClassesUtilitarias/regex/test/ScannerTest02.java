package devdojo.orientacaoobjetos.ClassesUtilitarias.regex.test;

import java.util.Scanner;

public class ScannerTest02 {
    public static void main(String[] args) {
        String text = "Jorge,Arthur, Joao, true, 200, 1";
        Scanner scanner = new Scanner(text);
        scanner.useDelimiter(",");

        while (scanner.hasNext()){
            if (scanner.hasNextInt()){
                int i = scanner.nextInt();
                System.out.println("int: " +i);
            } else if (scanner.hasNextBoolean()) {
               boolean b = scanner.hasNextBoolean();
                System.out.println("boolean: "+b);
            }else {
                System.out.println(scanner.next());
            }
        }
    }
}
