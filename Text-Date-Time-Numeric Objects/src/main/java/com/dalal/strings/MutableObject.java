package com.dalal.strings;

public class MutableObject {
    public static void main(String[] args) {
        //StringBuilder
        StringBuilder sb = new StringBuilder("Hello World");
        sb.length();
        sb.charAt(0);
        sb.indexOf("c");
        sb.indexOf("d", 2);
        sb.lastIndexOf("a", 3);
        sb.isEmpty();
        sb.substring(1);

        /*tous les methodes qui se trouve dans la classe String qui ne retourne pas
          pas un objet se trouve dans le string builder sauf le substring
          et le indexOf y'as pas le indexOf(int ch) et le indexOf(string,begin, end)
         */
    }
}
