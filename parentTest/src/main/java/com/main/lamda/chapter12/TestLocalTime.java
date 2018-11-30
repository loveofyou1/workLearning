package com.main.lamda.chapter12;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

public class TestLocalTime {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2018, 11, 29);
        System.out.println(localDate.getYear());
        System.out.println(localDate.getMonth());
        System.out.println(localDate.getDayOfMonth());
        System.out.println(localDate.getDayOfWeek());
        System.out.println(localDate.getDayOfYear());
        System.out.println(localDate.getChronology());
        System.out.println(localDate.getEra());
        System.out.println(localDate.getMonthValue());
        System.out.println(localDate.atTime(2,3,10));
        System.out.println(localDate.isLeapYear());
        System.out.println(LocalDate.now());

        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

        Period period = Period.between(LocalDate.of(2011,11,29),LocalDate.now());
        System.out.println(period.toTotalMonths());
        System.out.println(period.getDays());
        System.out.println(period.getMonths());
        System.out.println(period.getYears());
        System.out.println(period.getUnits());
        System.out.println(period.get(ChronoUnit.DAYS));

    }
}
