package dev.deyve.algorithmsjava.utils;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.*;

import static dev.deyve.algorithmsjava.utils.DateUtils.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DateUtilsTest {

    @Test
    @DisplayName("Get ZonedDateTime from LocalDateTime and ZoneId")
    void getLocalDateTimeWithZoneIdTest() {
        ZoneId mockZoneId = ZoneId.of("America/Sao_Paulo");
        LocalDateTime mockLocalDateTime = LocalDateTime
                .of(2020, 4, 11, 18, 14, 0, 0);

        ZonedDateTime result = getLocalDateTimeWithZoneId(mockLocalDateTime, mockZoneId);

        ZonedDateTime expectedResult = ZonedDateTime
                .of(2020, 4, 11, 18, 14, 0, 0, ZoneId.of("America/Sao_Paulo"));

        assertEquals(result, expectedResult, "ZonedDateTime are different");
    }

    @Test
    @DisplayName("Get the same time instant in another zone")
    void getSameInstantOtherZoneTest() {
        ZoneId mockZoneId = ZoneId.of("America/Toronto");
        ZonedDateTime mockZonedDateTime = ZonedDateTime
                .of(2020, 4, 11, 18, 14, 0, 0, ZoneId.of("America/Sao_Paulo"));

        ZonedDateTime result = getSameInstantOtherZone(mockZonedDateTime, mockZoneId);

        ZonedDateTime expectedResult = ZonedDateTime
                .of(2020, 4, 11, 17, 14, 0, 0, ZoneId.of("America/Toronto"));

        assertEquals(result, expectedResult, "ZonedDateTime are different");
    }

    @Test
    @DisplayName("Get Period of time between two LocalDates")
    void getPeriodBetweenTwoDatesTest() {
        LocalDate startDate = LocalDate.of(2000, 2, 15);
        LocalDate endDate = LocalDate.of(2020, 4, 11);

        Period result = getPeriodBetweenTwoDates(startDate, endDate);

        Period expectedResult = Period.of(20, 1, 27);

        assertEquals(result, expectedResult, "Period are different");
    }
}