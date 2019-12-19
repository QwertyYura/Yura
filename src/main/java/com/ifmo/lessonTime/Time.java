package com.ifmo.lessonTime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Year;
import java.util.List;
import java.util.stream.Collectors;

public class Time {

    public static void main(String[] args) {
        LocalDate startOfYear = Year.now().atDay(1); // начало текущего года
        List<LocalDate> fridays = startOfYear.datesUntil(startOfYear.plusYears(1))
                .filter(date -> date.getDayOfWeek() == DayOfWeek.FRIDAY && date.getDayOfMonth() == 13)
                .collect(Collectors.toList());

        System.out.println(fridays);
    }

}
