package dev.deyve.algorithmsjava.utils;

import java.time.*;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;

public class MainTest {

    public static void main(String[] args) {

        ZonedDateTime zonedDateTime = LocalDateTime.now().atZone(ZoneId.of("America/Sao_Paulo")); // ZonedDateTime.now();

        System.out.println(zonedDateTime);

//        OffsetDateTime offsetDateTime = OffsetDateTime.now();

//        System.out.println(offsetDateTime);


//        Instant instant = Instant.now();

//        System.out.println(instant);


        LocalDate localDate = LocalDate.of(2019, Month.FEBRUARY, 27);

        // 2019-02-01
        LocalDate firstDayOfFeb = localDate.with(TemporalAdjusters.firstDayOfMonth());

        System.out.println(firstDayOfFeb);

        // 2019-02-28
        LocalDate lastDayOfFeb = localDate.with(TemporalAdjusters.lastDayOfMonth());

        System.out.println(lastDayOfFeb);

        /*List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .stream()
                .filter(number -> number % 2 == 0)
                .map(number -> number * 2)
                .forEach(System.out::println);*/

        // America/Sao_Paulo
        ZoneId defaultZoneId = ZoneOffset.systemDefault();
        System.out.println(defaultZoneId);

        LocalDateTime ldt = LocalDateTime.of(2019, 6, 15, 0, 0);
        ZoneId zoneId = ZoneId.of("Europe/Bucharest");
        ZoneOffset zoneOffset = zoneId.getRules().getOffset(ldt);
        System.out.println(zoneOffset);

        ZoneOffset zoneOffsetFromString = ZoneOffset.of("+02:00");
        System.out.println(zoneOffsetFromString);

        OffsetTime offsetTime = OffsetTime.now(defaultZoneId);
        System.out.println(offsetTime);

        OffsetDateTime offsetDateTime = OffsetDateTime.now(defaultZoneId);
        System.out.println(offsetDateTime);
        System.out.println(offsetDateTime.getOffset());

        // +08:30 (this was obtained from 8 hours and 30 minutes)
        ZoneOffset zoneOffsetFromHoursMinutes = ZoneOffset.ofHoursMinutes(8, 30);
        System.out.println(zoneOffsetFromHoursMinutes);

        Date date = new Date();
        // e.g., 2019-02-27T12:02:49.369Z, UTC
        Instant instantFromDate = date.toInstant();
        System.out.println(instantFromDate);

        Instant instant = Instant.now();
        // Wed Feb 27 14:02:49 EET 2019, default system time zone
        Date dateFromInstant = Date.from(instant);
        System.out.println(dateFromInstant);

        ZoneId DEFAULT_TIME_ZONE = ZoneId.systemDefault();
        System.out.println(DEFAULT_TIME_ZONE);

    }
}
