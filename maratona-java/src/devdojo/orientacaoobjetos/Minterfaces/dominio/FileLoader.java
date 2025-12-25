package devdojo.orientacaoobjetos.Minterfaces.dominio;

public class FileLoader implements DataLoader, DataRemover {
    @Override
    public void load() {
        System.out.println("Carregando dados de um arquivo");
    }

    @Override
    public void remove() {
        System.out.println("Remoendo dados de um arquivo");
    }

    @Override
    public void checkPermission() {
        DataLoader.super.checkPermission();
    }
}
