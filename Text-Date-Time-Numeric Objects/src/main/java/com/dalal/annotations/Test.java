package com.dalal.annotations;

public class Test {
    public static void main(String[] args) {
        Class<?> c = Etudiant.class;
        Developper developper = c.getDeclaredAnnotation(Developper.class);
        //NullPointerException ? parce que jvm elle n'a pas trouvé l'annotation developer dans la classe Étudient
        System.out.println(developper);
        System.out.println(developper.code());
        System.out.println(developper.experience());
    }
}
