package devdojo.orientacaoobjetos.Minterfaces.dominio;

public class DatabaseLoader implements DataLoader, DataRemover {

    // Private => default => protected => public
    @Override
    public void checkPermission() {
        DataLoader.super.checkPermission();
    }

    @Override
    public void load(){
        System.out.println("Carrengaod dados do banco de dados.. ");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados do banco de dados");
    }

    public static void retriveMaxDataSize(){
        System.out.println("Dentro do retriveMaxDataSize do DatabaseLoader");
    }

}
