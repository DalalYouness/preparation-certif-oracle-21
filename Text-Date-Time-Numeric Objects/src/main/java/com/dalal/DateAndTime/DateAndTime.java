package com.dalal.DateAndTime;

import java.time.LocalDate;
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
    }
}
