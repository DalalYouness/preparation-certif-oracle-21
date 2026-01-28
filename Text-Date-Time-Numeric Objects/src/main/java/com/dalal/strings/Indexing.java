package com.dalal.strings;

public class Indexing {
    public static void main(String[] args) {
        // get charactere basing in it index
        String name = "Mohammed";
        System.out.println(name.charAt(2));
        //System.out.println(name.charAt(20)); //exception //StringIndexOutOfBoundsException

        System.out.println("*".repeat(20));


        // get an index of charactere or text
        String lastName = "dalal";
        System.out.println(lastName.indexOf('d'));
        System.out.println(lastName.indexOf("al"));
        System.out.println(lastName.indexOf("z")); //-1
        System.out.println(lastName.indexOf('a',2));
        System.out.println(lastName.indexOf("a",2,5)); // added in +java11

        //getting lenght
        System.out.println(lastName.length());
        System.out.println("*".repeat(20));
        //lastIndexOf //dalal
        System.out.println(lastName.lastIndexOf('a'));
        System.out.println(lastName.lastIndexOf('z'));
        System.out.println(lastName.lastIndexOf('a',2));
        System.out.println(lastName.lastIndexOf('z',2)); //no end index

        //substring
        String longPhrase = "je suis dalal youness";
        int start = longPhrase.indexOf('d');
        System.out.println(longPhrase.substring(start));

        int end = longPhrase.lastIndexOf('l') + 1;
        System.out.println(longPhrase.substring(start, end));

    }
}
