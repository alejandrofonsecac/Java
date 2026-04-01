package java.orientacaoobjetos.TclassesInternas.test;

public class OuterClassesTest01 {

    private String nome = "Alejandro";

    class Inner{
        public void printOuterClass(){
            System.out.println(nome);
            System.out.println(this);
            System.out.println(OuterClassesTest01.this);
        }
    }
    public static void main(String[] args) {
        OuterClassesTest01 outerClass = new OuterClassesTest01();

        Inner inner = outerClass.new Inner();
        inner.printOuterClass();
    }
}
