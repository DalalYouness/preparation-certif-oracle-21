package com.dalal.date_and_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateAndTime {
    public static void main(String[] args) {
        //current date
        LocalDate ld = LocalDate.now();
        LocalDate ld2 = LocalDate.of(ld.getYear(), ld.getMonth(), ld.getDayOfMonth());
        System.out.println(ld2);

        //time
        LocalTime lt = LocalTime.now();
        LocalTime lt2 = LocalTime.of(lt.getHour(), lt.getMinute(), lt.getSecond(), lt.getNano());
        System.out.println(lt2);


        //localdatetime
        LocalDateTime ldt = LocalDateTime.now();
        LocalDateTime localDateTime = LocalDateTime.of(ldt.toLocalDate(), ldt.toLocalTime());
        System.out.println(localDateTime);

        //combine time with date or inverse
        LocalDate localDate =  LocalDate.now();
        LocalDateTime localDateTime1 = localDate.atTime(lt);
        System.out.println(localDateTime1);

        LocalTime localTime1 = LocalTime.now();
        LocalDateTime localDateTime2 = localTime1.atDate(ld);
        System.out.println(localDateTime2);


        /*
        * dans cette partie on a vue comment creer un objet date , time et datetime
        * comment creer selon la date courante
        * on a vue comment recuperer la date ou le time du localdatetime
        * on a vu comment combiner date et time pour obtenir le localdatetime
        * had les date tzado f java.time f java 8 avant kana kanst3mlo
        * java.util.date
        * had les classes kamlin immutable  et final
        * */
    }
}
