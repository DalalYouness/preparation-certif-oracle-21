package com.dalal.format_and_parse;

import java.text.NumberFormat;
import java.util.Locale;

public class NumericValues {
    public static void main(String[] args) {
        //pour formater numeric values ou bien parser on utilise l'object NumberFormat
        //on fait un formatage des nombre selon la localisation
        // on format pour 3raisons : cuurency , how the number displaying in each local , percentage
        //Number => primitive , wrappers, bigDecimal

        Integer a = 20;
        Locale locale = Locale.CHINESE;
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(locale);
        NumberFormat percentFormat = NumberFormat.getPercentInstance(locale);
        NumberFormat numberFormat = NumberFormat.getNumberInstance(locale);

        String currency = currencyFormat.format(a);
        String percent = percentFormat.format(a);
        String number = numberFormat.format(a);
        System.out.println(currency);
        System.out.println(percent);
        System.out.println(number);

    }
}
