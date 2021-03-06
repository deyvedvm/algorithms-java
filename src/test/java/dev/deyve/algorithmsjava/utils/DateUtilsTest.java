package dev.deyve.algorithmsjava.utils;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.*;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

import static dev.deyve.algorithmsjava.utils.DateUtils.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Date Utils Test
 */
@DisplayName("Date Utils Test")
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
        LocalDate startDate = LocalDate.of(2000, Month.FEBRUARY, 15);
        LocalDate endDate = LocalDate.of(2020, Month.APRIL, 11);

        Period result = getPeriodBetweenTwoDates(startDate, endDate);

        Period expectedResult = Period.of(20, 1, 27);

        assertEquals(result, expectedResult, "Period are different");
    }

    @Test
    @DisplayName("Get Day After Days")
    void getDayAfterDaysTest() {
        LocalDate startDate = LocalDate.of(2020, Month.FEBRUARY, 15);

        LocalDate result = getDayAfterDays(startDate, 15);

        LocalDate expectedResult = LocalDate.of(2020, Month.MARCH, 1);

        assertEquals(result, expectedResult, "LocalDate are different");
    }

    @Test
    @DisplayName("Get Next Saturday")
    void getNextSaturdayTest() {
        LocalDate startDate = LocalDate.of(2020, Month.AUGUST, 2);

        LocalDate result = startDate.with(NEXT_SATURDAY);

        LocalDate expectedResult = LocalDate.of(2020, Month.AUGUST, 8);

        assertEquals(result, expectedResult, "LocalDate are different");
    }

    private static final TemporalAdjuster NEXT_SATURDAY = TemporalAdjusters.ofDateAdjuster(today -> {
        DayOfWeek dayOfWeek = today.getDayOfWeek();
        if (dayOfWeek == DayOfWeek.SATURDAY) {
            return today;
        }
        if (dayOfWeek == DayOfWeek.SUNDAY) {
            return today.plusDays(6);
        }
        return today.plusDays(6 - dayOfWeek.getValue());
    });
}