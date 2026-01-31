package com.dalal.format_and_parse;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class DateTimeValues {
    public static void main(String[] args) {
        //TODO: formating
        //pour faire le formatage et le parsing des date et des time on utilise l'objet datetimeformatter
        LocalDate localDate = LocalDate.now();
        Locale locale = Locale.getDefault(); //optionnel
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd", locale);
        String result  = localDate.format(formatter); //formatter.format(localDate); les deux correcte
        System.out.println(result);

        //l'utilisation de OflocalizedDate
        System.out.println("*".repeat(20));
        LocalDate localDate1 = LocalDate.now();
        DateTimeFormatter formatter1 = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).localizedBy(locale);
        String result1 = localDate1.format(formatter1);
        System.out.println(result1);


        //TODO:Parsing
        System.out.println("*".repeat(20));

        String dateString  = "29/01/2026";
        DateTimeFormatter formatter2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).localizedBy(locale);
        LocalDate localDate2 = LocalDate.parse(dateString, formatter2);
        System.out.println(localDate2.getYear());
        System.out.println(localDate2.getMonthValue());
        System.out.println(localDate2.getDayOfMonth());
        System.out.println(localDate2.getYear());



        /*donc dima ka kholasa formatting et le parsing
           - formatting l'object de formattage de date kayhtaj un pattern o kayhtaj la date o kayrad un string
           - le parsing kat3tih une date f string bach yparseha wi radha date ghir howa ewtani bach iradha
           kaykhaso ytbasa ela local la kant mst3mlo o style de format

           o les deux methode kaynin f les date classes o kaykono hta fl objet formatter ghir katqlb o sf
         */


    }
}
