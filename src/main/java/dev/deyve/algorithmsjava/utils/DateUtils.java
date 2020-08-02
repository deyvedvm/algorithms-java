package dev.deyve.algorithmsjava.utils;

import java.time.*;
import java.time.temporal.TemporalAdjuster;

/**
 * Date Utils
 */
public class DateUtils {

    /**
     * Get ZonedDateTime from LocalDateTime and ZoneId
     *
     * @param localDateTime Date
     * @param zoneId        ZoneId
     * @return ZonedDateTime
     */
    public static ZonedDateTime getLocalDateTimeWithZoneId(LocalDateTime localDateTime, ZoneId zoneId) {

        return localDateTime.atZone(zoneId);
    }

    /**
     * Get the same time instant in another zone
     *
     * @param zonedDateTime ZonedDateTime
     * @param zoneId        ZoneId
     * @return ZonedDateTime
     */
    public static ZonedDateTime getSameInstantOtherZone(ZonedDateTime zonedDateTime, ZoneId zoneId) {

        return zonedDateTime.withZoneSameInstant(zoneId);
    }

    /**
     * Get Period of time between two LocalDates
     *
     * @param startDate LocalDate
     * @param endDate   LocalDate
     * @return Period
     */
    public static Period getPeriodBetweenTwoDates(LocalDate startDate, LocalDate endDate) {

        return Period.between(startDate, endDate);
    }

    /**
     * Add days to a date
     *
     * @param startDate Date
     * @param days      Number of days
     * @return New Date
     */
    public static LocalDate getDayAfterDays(LocalDate startDate, int days) {
        Period period = Period.ofDays(days);
        TemporalAdjuster temporalAdjuster = p -> p.plus(period);

        return startDate.with(temporalAdjuster);
    }
}
