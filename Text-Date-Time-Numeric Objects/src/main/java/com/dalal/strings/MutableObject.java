package com.dalal.strings;

public class MutableObject {
    public static void main(String[] args) {
        //StringBuilder
        StringBuilder sb = new StringBuilder("Hello World");
//        sb.length();
//        sb.charAt(0);
//        sb.indexOf("c");
//        sb.indexOf("d", 2);
//        sb.lastIndexOf("a", 3);
//        sb.isEmpty();
//        sb.substring(1);

        /*tous les methodes qui se trouve dans la classe String qui ne retourne pas
          pas un objet se trouve dans le string builder sauf le substring
          et le indexOf y'as pas le indexOf(int ch) et le indexOf(string,begin, end)
         */

        //StringBuilder c'est une classe mutable et une Classe Final
        StringBuilder  sb2 = new StringBuilder("Hello World");

        System.out.println(sb.length()); // la longeur
        System.out.println(sb2.capacity()); // by default 16 a chaque fois la longueur devienne long la JVM augmente la capacity

        //insert
        sb2.insert(5," The");
        System.out.println(sb2);

        //append
        sb.append(" welcome");
        System.out.println(sb);

        //replace
        sb.replace(0,5,"Hi");
        System.out.println(sb);

        //delete
        sb.delete(0,3); //start exculisive end inclus
        System.out.println(sb);


        //reverse
        sb.reverse();
        System.out.println(sb);

        //System.out.println(sb.insert(20,"hi"));//StringIndexOutOfBoundsException
        System.out.println(sb.replace(10,20,"hi"));//pas de probleme qui bda man lbadya
        System.out.println(sb.replace(20,30,"hi"));//StringIndexOutOfBoundsException exception






    }
}
