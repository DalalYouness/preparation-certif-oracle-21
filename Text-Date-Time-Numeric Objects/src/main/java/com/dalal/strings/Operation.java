package com.dalal.strings;

public class Operation {
    public static void main(String[] args) {
        /*String objects are immutable , don't allow the direct modification
            into the objects every operation return a new reference (new object created)
            - String is a final class , other classes cannot inherite String classe
         */

        //trim for deleting the indentations
        String myTrimString = "   hello youness   ";
        System.out.println(myTrimString);
        //return a new object
        String result = myTrimString.trim();
        System.out.println(result);
        System.out.println(myTrimString == result); //false


        //toLower and toUpper
        String name = "youness";
        String upperName = name.toUpperCase();
        System.out.println(upperName);
        String lowerName = upperName.toLowerCase();
        System.out.println(lowerName);

        //concatenation
        System.out.println(result.concat(" ").concat(lowerName));

        //other methodes
        String b = "";
        System.out.println(b.isEmpty()); //true if b have white space it will return false
        System.out.println(b.isBlank());

        System.out.println("*".repeat(18));
        b = " ";
        System.out.println(b.isEmpty());//false
        System.out.println(b.isBlank()); //true



    }
}
