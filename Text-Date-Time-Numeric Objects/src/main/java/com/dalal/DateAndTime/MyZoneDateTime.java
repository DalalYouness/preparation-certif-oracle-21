package com.dalal.DateAndTime;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class MyZoneDateTime {
    public static void main(String[] args) {
        //creer zone object
        ZoneId zoneId = ZoneId.of("Canada/Eastern");
        System.out.println(zoneId);

        System.out.println("*".repeat(6));

        //getZones
        //ZoneId.getAvailableZoneIds().forEach(System.out::println);

        //create Date & time with Zone
        //now rah ghayakhdo la date dyali wakha ana ghandir had zone hit hadchi cutom ana li msaybo
        ZonedDateTime zonedDateTime = ZonedDateTime.of(LocalDateTime.now(),zoneId);// final classe
        System.out.println(zonedDateTime);

        System.out.println("*".repeat(20));
        //at zone
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime.atZone(zoneId));

        //operations like localdate localetime ...

        System.out.println("*".repeat(20));
        //Instant and zone
        /*
        * UTC = LocalDateTime - Offset
          ex avec paris :UTC = 18:00 - 01:00 = 17:00
*          java kacthouf date time katchouf zone bnisba l tawqit l3alami
*         o katchad date o tnqos mano dkchi li zayd fl UTC bach trado ltawqit l3alamo
*         fhal matalan lqato UTC+2 katgol donc had la date madam howa f had la zone li zayda
*        2 bach nrado l UTC khasni nqos mano 2
        * */
        Instant instant = localDateTime.atZone(zoneId).toInstant();
        System.out.println(instant);

        // baqi liya withZoneSameLocal & SameInstant

    }
}
