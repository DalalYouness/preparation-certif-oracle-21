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
        int x = 0;
    }

     public int sum(int a, int b) {
        int x = 10; //effectively final

        class Adder {
            int sum(int a, int b) {
                return (a + b) * x;
            }
        }
        Adder adder = new Adder();
        return adder.sum(a, b);
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

        System.out.println(outer.sum(10, 20));
    }
}



//
//donc ka kholasa - static inner classe meme si est dans une
//classe mais l'objet de cette classes est independent du classe outer donc y'as
//pas de this vers la classe outer parceque c'est static , par contre non-static
//inner class la classe outer independent du classe inner
//mais le inner non le inner classe est lié a la classe outer c'est dire possede un this vers cette la classe outer


/*
* local classe
*
* c'est une classe declarer directement dans la methodes si on veut l'utilisé tmporement seulement au niveau de la methode de
* outer classe mais la chose la plus importante c'est ca :
* c'est que les variables locaux definient avant le local classe implicitement effectively final
* ce qui est logique
*
*
* */