package devdojo.orientacaoobjetos.ClassesUtilitarias.io.test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");

        try {
            boolean isCreated = file.createNewFile();
            System.out.println("Created: " + isCreated);

            System.out.println("path: " + file.getPath()); //Nome arquivo
            System.out.println("pathAbsolute: " + file.getAbsolutePath()); // Caminho do arquivo
            System.out.println("Is directory " + file.isDirectory());
            System.out.println("Is file "+ file.isFile());
            System.out.println("Is hidden " + file.isHidden());
            System.out.println("last modified "+ new Date(file.lastModified()));
            if (file.exists()){
                boolean isDelete = file.delete();
                System.out.println("Delete: " + isDelete);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
