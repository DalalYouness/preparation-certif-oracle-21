package com.dalal.nestedclasses;

import com.dalal.annotations.Person;

//on va tester anonymous class

interface Eatable {
    void eat();
}

public class Personne {
    private String nom;
    private String prenom;
    private int age;

    public Personne() {

    }
    public Personne(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void print(){
        System.out.println(nom + " " + prenom + " " + age);
    }


}


class Test {
    public static void main(String[] args) {
        Personne personne = new Personne("Dalal", "Youness", 18);
        personne.print();

        Personne person = new Personne() {
            //anonymous class manqdroch n3arfo fiha static members ola constructor
            @Override
            public void print() {
                System.out.println("Nom: " + this.getNom() + " Prenom: " + this.getPrenom() + " Age: " + this.getAge());
            }
        };

        person.setNom("Dalal");
        person.setPrenom("Youness");
        person.setAge(27);
        person.print();
    }

    /*
    * anonymous class c'est une classe qui n'as pas de nom ,
    * on l'utilise si on veut faire soit une implementation
    * a la volé ou bien une redifinition une seul fois on l'utilise beaucoups domme une callback avec les interface fonctionnel c'est comme les callbacks du javascrips et grace a ces classe anonyme java a inclus la programmations fonctionnel c'est que on passe une call back ou bien on passe un comportement dans les parametres d'une methode avec une implementation a la volé , et pour mettre les chose plus simple
    * java a introduit le concepts des lambda expressions comme les arrow function en js
    * fhala  galti 3tatna la possibilté 7na li walina kan passew un comportement makaybqach l object li kaykhtar
    * kaywli flexible
    * */


}
