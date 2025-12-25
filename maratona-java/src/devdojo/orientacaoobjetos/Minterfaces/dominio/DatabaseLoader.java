package devdojo.orientacaoobjetos.Minterfaces.dominio;

public class DatabaseLoader implements DataLoader, DataRemover {

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


}
