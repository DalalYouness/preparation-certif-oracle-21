package com.dalal.language_coutrie;

import java.util.Arrays;
import java.util.Locale;

public class Localisation {
    public static void main(String[] args) {
        //ZoneId = فين راك فالعالم ⏰ mt3al9 b date and time lwaqt bnisba l zone fl 3alam
        //Locale = كيفاش كتهضر وكتكتب 🗣️ mt3alq b les pays dkchi elach bhad lobject katqdr tformateer text , numbers , currency, how to display time
        //ZoneId كيجاوب على: شحال فالساعة؟
        //Locale كيجاوب على: كيفاش نكتب ونعرض؟
        // local c'est un objet son etat c'est le pays et la langue du pays
        //getAvailableLocales
        //locales must have a luanguage but country and variant is optional
        Arrays.stream(Locale.getAvailableLocales()).forEach(System.out::println);
        System.out.println("*".repeat(20));
        //create LocalObject
        System.out.println(Locale.getDefault());
        Locale locale = new Locale("en", "US");
        //or
        Locale locale1 = Locale.of("ar","MA");
        System.out.println(locale1);

        //with lang seulement
        Locale locale2 = Locale.of("ar");
        System.out.println(locale2);

        //enums
        System.out.println(Locale.FRANCE);


    }

}
