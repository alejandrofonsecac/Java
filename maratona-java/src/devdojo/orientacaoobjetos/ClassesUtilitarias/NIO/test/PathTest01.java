package devdojo.orientacaoobjetos.ClassesUtilitarias.NIO.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest01 {
    public static void main(String[] args) {
        Path p1 = Paths.get("C:\\Users\\jfons\\IdeaProjects\\Java\\pasta2\\arquivo_renomeado.txt");
        Path p2 = Paths.get("C:\\Users\\jfons\\IdeaProjects\\Java\\pasta2 ", "arquivo_renomeado.txt");

        System.out.println(p1.getFileName());
    }
}
