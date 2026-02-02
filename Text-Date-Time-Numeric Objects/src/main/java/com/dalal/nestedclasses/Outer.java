package com.dalal.nestedclasses;

public class Outer {
    private static String name;
    static class Nested {
        void hello() {
            System.out.println("Hello " + name);
            privateMethod();
            // nested static classe ne peut pas accéder au non-static field de outer classe
            // on peut acceder au static fields et méthodes du outer classe
            // on peut instancier le nested static classe sans besoin de l'existence d'une instance de outer classe
        }
    }

    private static void privateMethod() {
        System.out.println("Private method");
    }



    public static void main(String[] args) {
        Outer.name = "youness";
        Outer.Nested s = new Outer.Nested();
        s.hello();
    }
}
