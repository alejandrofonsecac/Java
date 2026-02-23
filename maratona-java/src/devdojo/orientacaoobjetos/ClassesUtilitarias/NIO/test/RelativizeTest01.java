package devdojo.orientacaoobjetos.ClassesUtilitarias.NIO.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTest01 {
    public static void main(String[] args) {
        // {1} Caminho relativo pois o java nao sabe aonde o arquivo esta

        Path dir = Paths.get("/home/william");
        Path clazz = Paths.get("/home/william/devdojo/OlaMundo.java");
        Path pathtoClazz = dir.relativize(clazz);
        System.out.println(pathtoClazz);

        Path absoluto1 = Paths.get("/home/william");
        Path absoluto2 = Paths.get("/usr/local");
        Path absoluto3 = Paths.get("/home/william/devdojo/OlaMundo.java");
        Path relativo1 = Paths.get("temp"); //{ 1 }
        Path relativo2 = Paths.get("temp/temp.20211921");

        System.out.println("1 " + absoluto1.relativize(absoluto3));
        System.out.println("2 " + absoluto3.relativize(absoluto1));
        System.out.println("2 " + absoluto1.relativize(absoluto2));
    }
}
