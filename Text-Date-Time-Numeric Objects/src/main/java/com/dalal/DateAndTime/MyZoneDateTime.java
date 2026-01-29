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

        System.out.println("#".repeat(20));
        // baqi liya withZoneSameLocal & SameInstant
        LocalDateTime localDateTime1 = LocalDateTime.now();
        System.out.println(localDateTime1);
        ZonedDateTime zonedDateTime1 = localDateTime1.atZone(zoneId);
        System.out.println("ZoneDateTime [Canada]: ".concat(zonedDateTime1.toString()));
        ZonedDateTime withZoneJapanLocal = zonedDateTime1.withZoneSameLocal(ZoneId.of("Japan"));
        System.out.println("ZoneDateTime [Japan]:" + withZoneJapanLocal);
        ZonedDateTime withZoneJapanInstant =  zonedDateTime1.withZoneSameInstant(ZoneId.of("Asia/Tokyo"));
        //donc hna li ghaytra howa java ghatchad dak la date ghat3trj3o instant bnisba l anaha f canada ya3ni ghadi tnqos mano -5h (hit canada UTC-5)
        //apres ghadi zid elih 9h hit japan hit japan (YTC+9)
        //natija ghada tkon (11 - (-5) + 9 = 16 + 9 = 25 = 01:00
        //zonedatetime - utc(prevZone) + utc(currentZone)
        System.out.println("ZoneDateTime [Japan]:" + withZoneJapanInstant);


    }
}
