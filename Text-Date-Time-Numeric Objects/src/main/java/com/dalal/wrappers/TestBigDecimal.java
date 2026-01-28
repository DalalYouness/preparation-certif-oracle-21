package com.dalal.wrappers;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class TestBigDecimal {
    public static void main(String[] args) {
        /*BigDecimal utilisable pour les cas ou on veur une valeur decimal exact
        il envelope les nombres decimal d'une maniere precis
        BigDecima immutable pas final et aussi extend number
         */

        //1er methode d'instanciation

        BigDecimal number = new BigDecimal("123.45");//passer comme string c'est le plus utilisé parceque il donne un valeur precis
        System.out.println(number);
        BigDecimal number2 = new BigDecimal(123);
        System.out.println(number2);

        //2eme methode
        BigDecimal number3 = BigDecimal.valueOf(123);
        System.out.println(number3);

        //methodes
        System.out.println(number3.subtract(number));
        System.out.println(number3.add(number));
        System.out.println(number3.multiply(number));
        System.out.println(number3.divide(number, RoundingMode.HALF_UP));
        System.out.println(number3.remainder(number));


        //scaling c'est de precider combient de nombre tu veux afficher apres le point
        System.out.println("*".repeat(20));
        BigDecimal scalingNumber = BigDecimal.valueOf(10.12354);
        System.out.println(scalingNumber.setScale(3, RoundingMode.HALF_EVEN));


        //RoundingMode on doit le specifier si on precise le scale et si on veut apple la methode devide
        /*on a 3 Rounding Mode
        *
        * 1 - HALF_DOWN hada fha roudn l3adi ghir hiya ila 5 kayhabat makaytl3ch machi fhal lup
        * 2 - UP hada ay haja wra scale kayakhodha b 3ayn l3ibar o kayzid wahd
        * 3 - HALF_UP normale rounding
        * 4 - EVEN ila kan raqm li wra fin bghina nhabso < 5 kanhabto
        *     ila kan kbar man 5 kantl3o
        *     ila kan kaysawi 5 kanchoufo dik sa3a raqm fin hbasna kan zawji kankhaliwh
        *     kan fardi kantal3o bach nrdhoh zawji
        *
        * */

        //UP comme le ceil
        System.out.println(new BigDecimal("123.122").setScale(2, RoundingMode.UP));

        //HALF_UP comme le round ( HALF = 5 UP si a dire man egale l half 5 lfo9 tala3)
        System.out.println(new BigDecimal("123.124").setScale(2, RoundingMode.HALF_UP));

        //HALF_DOWN comme ( HALF = 5 UP si a dire man egale 5 lta7t habat)
        System.out.println(new BigDecimal("123.125").setScale(2, RoundingMode.HALF_DOWN));

        //HALF_EVEN (HALF + EVEN cad mnin ykon lhalf howa raq li wra fin scalina nchouf raqm li qbal kanzawji nkhaliwh kan fardi ntal3oh bach ywali zwji
        // sf o dkchi lakhor kaybqa 3adi ila makanch 5 ya3ni sghar man 5 nhabto kbar man 5 ntal3o
        System.out.println(new BigDecimal("123.136").setScale(2, RoundingMode.HALF_EVEN));



    }
}
