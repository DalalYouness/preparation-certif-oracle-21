package com.dalal.wrappers;

public class TestWrapper {
    public static void main(String[] args) {
        /*wrapper classes c'est pour envlopper les types primitive dans un objet
            parceque y'as des api dans java qui accepte seulement les objet comme les
            list , Map...
         */

        /*
        * - boxing c'est que on prend la valeur primitive o le met dans un objet de type wrapper
        * java fait ca d'une maniere automatique
        * */
        // manuelle boxing
        Double a = Double.valueOf(20.5d);
        System.out.println(a);
        System.out.println("*".repeat(20));
        //autoboxing
        Double b = 20.6;//java va prend la valeur et il va l'envolpper dans un objet
        System.out.println(b);
        System.out.println("*".repeat(20));
        //Unboxing manuelle : dans ce cas on a objet qui contient la valeur primitive , le unboxing c'est de
        // recuperer la valeur primitive de l'objet
        Integer i = 20;
        int ip = i.intValue();
        System.out.println(ip);
        System.out.println("*".repeat(20));
        //autounboxing
        Float f = 20.4f;
        float fp = f;
        System.out.println(fp);


        //le cas d'exception nullpointerexception
        System.out.println("*".repeat(20));
        Integer n = null;
        int ex = n; // java va lancer une exception nullpointer exception
        /*pourquoi ? parceque n est null est dans le background java va essayer de faire n.intValue
        pour recuperer la valeur mais n est null
         */

        System.out.println(ex);

        /*
        * Wrapper classes sont final , elles heritenet la class Number
        *
        * */


        System.out.println("*".repeat(20));
        /*quelque operation*/
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.max(Integer.MAX_VALUE, Integer.MIN_VALUE));
        System.out.println(Integer.min(Integer.MAX_VALUE, Integer.MIN_VALUE));
        System.out.println(Integer.parseInt("10"));

        //convert a primitive to string
        System.out.println(String.valueOf(20) + 20);

        //si y'as plusieur d'autoboxing et autounboxing ca va diminuer la performance de l'app parce que y'a un traitement derriere ca


    }
}
