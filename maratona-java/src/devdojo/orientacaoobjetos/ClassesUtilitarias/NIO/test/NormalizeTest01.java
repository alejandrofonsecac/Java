package devdojo.orientacaoobjetos.ClassesUtilitarias.NIO.test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizeTest01 {
    public static void main(String[] args) {
        String diretorioDoProjeto = "/home/william/dev";
        String arqivoTxt = "../../arquivo.txt";

        Path ph1 = Paths.get(diretorioDoProjeto, arqivoTxt);
        System.out.println(ph1);
        System.out.println(ph1.normalize());

        Path ph2 = Paths.get("/home/./william/./dev");
        System.out.println(ph2);
        System.out.println(ph2.normalize());
    }
}
