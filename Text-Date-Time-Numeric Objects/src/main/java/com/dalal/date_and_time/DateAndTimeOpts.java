package com.dalal.date_and_time;

import java.time.LocalDate;
import java.time.LocalTime;

public class DateAndTimeOpts {
    public static void main(String[] args) {
        //je vais faire un exemple sur le LocalDate et les memes dans les autres

        //with rah fhal set fhala angolo bghina objet with had lyear ola with had lmounth
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        System.out.println("***********************");
        System.out.println(localDate.withYear(2024).withMonth(2).withDayOfMonth(13)); //y'as aussi day of year
        System.out.println("***********************");


        //plus and minux
        System.out.println(localDate.plusYears(2).plusMonths(2).atTime(LocalTime.MIDNIGHT));


        //getXXX
        System.out.println(localDate.getYear());

        //isBefore , isAfter , isEqual and isLeapYear
        System.out.println(localDate.isBefore(LocalDate.of(2029,02,13)));
        System.out.println(localDate.isEqual(LocalDate.of(2029,02,13)));
        System.out.println(localDate.isAfter(LocalDate.of(2029,02,13)));
        System.out.println(localDate.isLeapYear());


    }
}
