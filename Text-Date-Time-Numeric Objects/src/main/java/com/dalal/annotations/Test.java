package com.dalal.annotations;

public class Test {
    public static void main(String[] args) {
        Class<Person> c = Person.class;
        Developper developper = c.getDeclaredAnnotation(Developper.class);
        //NullPointerException ? parce que jvm elle n'a pas trouvé l'annotation developer dans la classe Étudient
        System.out.println(developper);
        System.out.println(developper.code());
        System.out.println(developper.experience());

        System.out.println("**************************************");

        //test de l'héritage d'une annotation

        Class<Etudiant> c1 = Etudiant.class;
        //on a utilisé getAnnotation hit Declared kat3ni jbd liya li mdeclarer explicitement
        Developper developper1 = (Developper) c1.getAnnotation(Developper.class); //elle va me donner null parc que j'ai pas mentionné que l'annotatopn est heritable
        //donc si je veux laisser le controlle manuelle j'ajoute direcetement
        //si non , si je veux que tous les classes fille utilise l'annotation je vais ajouter Inherited au moment de creation de l'annotation
        System.out.println(developper1);

    }
}
