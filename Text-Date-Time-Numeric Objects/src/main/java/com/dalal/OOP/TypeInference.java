package com.dalal.OOP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class TypeInference {
    private  final int b;
    public  TypeInference(int b) {
        this.b = b;
    }
    public TypeInference() {
        this.b = 1;
    }

    public static void main(String[] args) {
        var date = new Date();
        System.out.println(date);

        for (var i = 0; i < 10; i++) {
            System.out.println(date);
        }

        for(var local: Locale.getAvailableLocales()){
            System.out.println(local);
        }

        var list = new ArrayList<>();

        try(var reader = new BufferedReader(new InputStreamReader(System.in))){

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        //Constantes
        final int a;
        /*
        * pour les constants d'instance ou static c'est obligé de l'initilisé
        * c'est logie 7it mnin ghancrew un objet ghada t3tah valeur par default o hada machi l'objectif
        * donc on a 3 possibilité d'initialisation :
        *   - via l'attribue
        *   - via blocks (non-static or static)
        *   - via contructors ( nqdr f ga3 les constructeur n3tiha 9ima li jaya man les parametre ola n initilisiha)
        *   c'est logique hit le constructeur rah kayt3yt elih mara whda o f dik lhda kat3zl wahd sf
        *   donc nta aslan damn anaho kola whda ghadi y3ti la valeur mara whda hit l constructeur machi methode
        *
        * pour les variables locaux et des parametre constant normale c'est a dire
        * des que la valeur affecter on peut pas la changé mais on a la possibilté de le creer
        * sans l'initilisé
        *
        * */



        //var limitations
        /*
        * 1 - complexe type (sauf si y'as d la genericté
        * 2 - avec null
        * 3 - reseaigned
          4 - variable non initialisé
          5 - fields
          6 - parametres
        *
        * */
    }
}
