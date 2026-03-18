package devdojo.orientacaoobjetos.TclassesInternas.test;

class Animal{
    public void walk(){

    }
}

public class ClassesAnonimasTest01 {


    public static void main(String[] args) {

        //Uma classe anonima, usada quando você quer criar algo rápido.
        Animal animal = new Animal(){
            @Override
            public void walk() {
                System.out.println("Walking...");
            }
        };
        animal.walk();
    }
}
