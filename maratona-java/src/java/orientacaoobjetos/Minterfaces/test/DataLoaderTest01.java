package java.orientacaoobjetos.Minterfaces.test;

import java.orientacaoobjetos.Minterfaces.dominio.DataLoader;
import java.orientacaoobjetos.Minterfaces.dominio.DatabaseLoader;
import java.orientacaoobjetos.Minterfaces.dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();

        databaseLoader.checkPermission();
        databaseLoader.load();
        fileLoader.load();

        databaseLoader.remove();

        DataLoader.retriveMaxDataSize();
        DatabaseLoader.retriveMaxDataSize();
    }
}
