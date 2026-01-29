package com.dalal.date_and_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class PeriodeTest {
    public static void main(String[] args) {
        //Period
        /*ghadi nla7do que mnin kan creew une periode rah
         f of kanlqaw les parametres years mounths et days
         machi fhal date katlqa ghir year mounth day
         hit rah periode fhala katqol had la periode fiha
         two years  3mounths et 10days
         */

        //creation d'une periode
        //periode etat : numberOfYears , mounths , days
        Period period = Period.of(2, 10, 15);
        System.out.println(period);

        //getters
        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());

        System.out.println("*".repeat(20));
        //setters  methode chaining because periode is immutable every operation return new object
        System.out.println(period.withYears(5).withMonths(5).withDays(5));

        System.out.println("*".repeat(20));

        //plus and minus
        System.out.println(period.plusYears(1).plusMonths(1).plusDays(1));
        System.out.println(period.minusYears(1).plusMonths(1).plusDays(1));

        System.out.println("*".repeat(20));
        //check negativ or zero
        System.out.println(period.isNegative());
        System.out.println(period.isZero());

        System.out.println("*".repeat(20));

        //addTo a date
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime date = (LocalDateTime) period.addTo(localDateTime);
        System.out.println(date);

        System.out.println("*".repeat(20));

        //between two dates
        System.out.println(Period.between(LocalDate.now(),LocalDate.of(2028,1,29)));



    }
}
