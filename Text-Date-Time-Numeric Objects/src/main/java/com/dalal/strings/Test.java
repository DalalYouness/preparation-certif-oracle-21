package com.dalal.strings;

import java.awt.*;

public class Test {
    public static void main(String[] args) {
        //diff between string new and string literals

        //because with new jvm create two differente object
        String name = new String("youness");
        String name2 = new String("youness");
        System.out.println(name == name2); //false

        // string literals objects stored in string pool object
        String fruitName = "banana";
        String fruitName2 = "banana";
        System.out.println(fruitName == fruitName2);//true

        // using intern methode to return the reference
        String a = new String("abc");
        String b = "abc";
        System.out.println(a == b); //false

        String c = a.intern();
        System.out.println(b==c);//true


    }

}
