package dev.deyve.algorithmsjava.utils;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Set;

public class DateUtilsCopy {

    public static void main(String[] args) {

      /*  LocalDate localDate = LocalDate.parse("2020-06-01");

        LocalTime localTime = LocalTime.parse("12:23:44");

        LocalDateTime localDateTime = LocalDateTime.parse("2020-06-01T11:20:15");

        ZonedDateTime zonedDateTime = ZonedDateTime.parse("2020-06-01T10:15:30+09:00[Asia/Tokyo]");

        OffsetDateTime offsetDateTime = OffsetDateTime.parse("2007-12-03T10:15:30+01:00");

        OffsetTime offsetTime = OffsetTime.parse("10:15:30+01:00");

        System.out.println(localDate);

        System.out.println(localTime);

        System.out.println(localDateTime);

        System.out.println(zonedDateTime);

        System.out.println(offsetDateTime);

        System.out.println(offsetTime);


        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate localDateFormatted = LocalDate.parse("01.06.2020", dateFormatter);

        System.out.println(localDateFormatted);

        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH|mm|ss");
        LocalTime localTimeFormatted = LocalTime.parse("12|23|44", timeFormatter);

        System.out.println(localTimeFormatted);


        String stringLD = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        System.out.println(stringLD);


        // or shortly
        String stringLocalDate = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        System.out.println(stringLocalDate);*/

        LocalDate localDate = LocalDate.now(); // 2019-Feb-24
        LocalTime localTime = LocalTime.now(); // 02:08:10 PM

        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);

        System.out.println(localDateTime);

        // 2019-Feb-24 02:08:10 PMS
        String localDateTimeAsString = localDateTime.format(DateTimeFormatter.ofPattern("yyyy-MMM-dd hh:mm:ss a"));

        System.out.println(localDateTimeAsString);

        // 2019-02-24T15:05:21.781049600Z
        Instant timestamp = Instant.now();
        System.out.println(timestamp);


        OffsetDateTime now = OffsetDateTime.now(ZoneOffset.UTC);
        System.out.println(now);

        Instant twoHourLater = Instant.now().plus(2, ChronoUnit.HOURS);
        System.out.println(twoHourLater);

        Instant tenMinutesEarlier = Instant.now().minus(10, ChronoUnit.MINUTES);
        System.out.println(tenMinutesEarlier);

        long difference = tenMinutesEarlier.until(twoHourLater, ChronoUnit.SECONDS);
        System.out.println(difference);

        // 2019-02-24T15:27:13.990103700
        LocalDateTime ldt = LocalDateTime.ofInstant(Instant.now(), ZoneOffset.UTC);

        // 2019-02-24T17:27:14.013105Z
        Instant instantLDT = LocalDateTime.now().toInstant(ZoneOffset.UTC);

        // TODO Implements method and test
        LocalDate startLocalDate = LocalDate.of(1978, 9, 17);
        LocalDate endLocalDate = LocalDate.of(2020, 3, 25);
        Period periodBetween = Period.between(startLocalDate, endLocalDate);

        System.out.println(periodBetween);

        System.out.println(periodBetween.getYears());

        Set<String> zoneIds = ZoneId.getAvailableZoneIds();

        zoneIds.forEach(System.out::println);
        System.out.println(zoneIds.size());

        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);

        LocalDateTime nowWithZoneId = LocalDateTime.now();
        System.out.println(nowWithZoneId);

        // TODO Implements method and test
        // Get the current Date and Time with ZoneID
        ZonedDateTime zdt = nowWithZoneId.atZone(zoneId);
        System.out.println(zdt);

        String utcOffset = zdt.getOffset().getId().replace("Z", "+00:00");
        System.out.println(utcOffset);

    }
}
