package devdojo.orientacaoobjetos.ClassesUtilitarias.io.test;

// FileWriter
// FileReader
// FileRedder
// BufferedWriter
// BufferedReader

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");

        try(FileWriter fw = new FileWriter(file);) {
            fw.write("Hoje é uma segunda-feira.\nAmanha será terça-feira.");
            fw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
