package com.dalal.date_and_time;

import java.time.Duration;
import java.time.LocalTime;

public class DurationTest {
    public static void main(String[] args) {
       //Duration c'est la meme chose que duration mais pour le time

        //creation Duration
        Duration duration = Duration.ZERO; //0
        Duration duration2 = Duration.ofDays(10); //return hours
        System.out.println(duration2);
        System.out.println(Duration.ofHours(20));
        System.out.println(Duration.ofMinutes(10));
        System.out.println(Duration.ofSeconds(10));
        System.out.println(Duration.ofMillis(10)); //with seconde
        System.out.println(Duration.ofNanos(10)); //with seconde

        //add to temporals
        LocalTime localTime = LocalTime.now();
        duration2.addTo(localTime);
        System.out.println(duration2);

        // le reste c'est comme la periode sauf que
        // isPositive  added



        System.out.println( Duration.between(localTime, localTime.plusHours(10)));
    }
}
