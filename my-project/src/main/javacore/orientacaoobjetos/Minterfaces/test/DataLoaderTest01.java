package javacore.orientacaoobjetos.Minterfaces.test;

import javacore.orientacaoobjetos.Minterfaces.dominio.DataLoader;
import javacore.orientacaoobjetos.Minterfaces.dominio.DatabaseLoader;
import javacore.orientacaoobjetos.Minterfaces.dominio.FileLoader;

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
