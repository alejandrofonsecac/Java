package javacore.orientacaoobjetos.ZZApadroesDeProjeto.test;

import javacore.orientacaoobjetos.ZZApadroesDeProjeto.domain.Person;

public class BuildPatternTest01 {
    public static void main(String[] args) {
        Person.Builder builder = new Person.Builder()
                .firstName("Jorge")
                .lastName("Fonseca")
                .email("jfons@gmail.com")
                .userName("jf");

        System.out.println(builder);

    }
}
