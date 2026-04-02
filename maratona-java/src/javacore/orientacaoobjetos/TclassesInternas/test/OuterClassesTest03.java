package javacore.orientacaoobjetos.TclassesInternas.test;

class Externa {

    static class InternaEstatica {
        public void print(){
            System.out.println("Classe estática");
        }
    }
}

//NÃO precisa de instância da classe externa
//funciona como uma classe independente

public class OuterClassesTest03 {
    public static void main(String[] args) {
        Externa.InternaEstatica interna = new Externa.InternaEstatica();
        interna.print();
    }
}
