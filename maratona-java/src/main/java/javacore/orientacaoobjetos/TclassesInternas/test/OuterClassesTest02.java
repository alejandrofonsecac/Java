package javacore.orientacaoobjetos.TclassesInternas.test;

public class OuterClassesTest02 {

    private String nome = "Alejandro";
    private int idade = 21;

    void print(){
        System.out.println(nome);
        String lastName = "Alejandro";

        // Ele tem que ser final, pois nao pode ser modificado
        //Ela só pode acessar variáveis do método se forem: final ou efetivamente final
        class LocalClass{
            public void printLocal(){
                System.out.println("Minha idade é:" + idade);
                System.out.println("Meu sobrenome é: " + lastName);
            }
        }
        LocalClass localClass = new LocalClass();
        localClass.printLocal();
    }

    public static void main(String[] args) {
        OuterClassesTest02 outerClass = new OuterClassesTest02();
        outerClass.print();
    }
}
