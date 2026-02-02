package com.dalal.nestedclasses;

public class Outer {
     static String name;
     int age;

    static class Nested {
        void hello() {
            System.out.println("Hello " + name);
            privateMethod();
            // nested static classe ne peut pas accéder au non-static field de outer classe
            // on peut acceder au static fields et méthodes du outer classe
            // on peut instancier le nested static classe sans besoin de l'existence d'une instance de outer classe
        }
    }

    class NonStaticNested {


        void hello() {
            System.out.println("Hello non-satic" + name + " " + age);
            privateMethod();
            nonStaticMethod();
        }
    }

    private static void privateMethod() {
        System.out.println("Private method");
    }

    private void  nonStaticMethod() {
        System.out.println("Non-static method");
    }



    public static void main(String[] args) {
//        Outer.name = "youness";
//        Outer.Nested s = new Outer.Nested();
//        s.hello();

        //si on veux instancier non-static inner classe on est obligé de creer une instance de outer parceque le inner lié avec le outer
        Outer outer = new Outer();
        outer.age =27;
        Outer.name = "youness";
        Outer.NonStaticNested nonStaticNested = outer.new NonStaticNested();
        nonStaticNested.hello();

    }
}



//
//donc ka kholasa - static inner classe meme si est dans une
//classe mais l'objet de cette classes est independent du classe outer donc y'as
//pas de this vers la classe outer parceque c'est static , par contre non-static
//inner class la classe outer independent du classe inner
//mais le inner non le inner classe est lié a la classe outer c'est dire possede un this vers cette la classe outer
