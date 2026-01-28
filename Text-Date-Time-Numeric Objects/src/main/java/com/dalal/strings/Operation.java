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

    }
}
