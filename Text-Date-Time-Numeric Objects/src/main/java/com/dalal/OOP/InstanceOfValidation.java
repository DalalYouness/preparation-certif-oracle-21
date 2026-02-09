package com.dalal.OOP;

import java.util.ArrayList;
import java.util.List;

public class InstanceOfValidation {
    public static void main(String[] args) {

        List number   = new ArrayList();
        number.add("1");
        number.add(2);
        number.add(3);
        number.add("4");
        number.add("5");

        Object o = number.get(1);
        //hna ghadi doz l2omor 3adi mais l probleme fin kaytra howa
        //le compilateur kaykon kay3rf f polymor ghir type dyal reference makaykonch 3arf le type dyal object fl memory
        //donc ila castina ref l child dyalo hna compilateur kaykhli l 2omor doz 3adi hit howa kaytchecr ghir wach binathom relation
        System.out.println(o);


        //ex
        Object o2 = number.get(1);
        //String s =  (String)o2; //kanla7do anaho khla l cast idoz 3adi mea l3il anaho type dyal obj Integer hna ghanti7o f exce^tion castException
        //hit wala 3adna ref man type String ghay pointer ela objet man type Integer

        //la solution c'est de verifier le type de l'objet avant de faire le cast
        //if had ref kaypointer ela object man had naw3 dir liya had lcast
        if(o2 instanceof String) {
            String s =  (String)o2;
            System.out.println(s);
        }
        if(o2 instanceof Integer) {
            Integer i = (Integer)o2;
            System.out.println(i);
        }

    }
}
