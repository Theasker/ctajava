package com.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import static java.time.Month.*;  // Months
import static java.time.DayOfWeek.*; // Days of the week
import static java.time.temporal.ChronoUnit.*;  // DAYS, HOURS, etc
import java.time.temporal.TemporalAdjusters;

public class LocalDatesAndTimes {

  public static void main(String[] args) {

    // Abe Lincoln's Birthday: February 12, 1809, died April 15, 1855
    //   How old when he died?
    //   How many days did he live?  
    LocalDate abeBorn = LocalDate.of(1809, FEBRUARY, 12);
    LocalDate abeDies = LocalDate.of(1855, APRIL, 15);
    System.out.println("Abe was " + abeBorn.until(abeDies, YEARS) + " when he died.");
    System.out.println("Abe lived for " + abeBorn.until(abeDies, DAYS) + " days.");
    System.out.println("");

    // Bennedict Cumberbatch, July 19, 1976
    //   Born in a leap year?
    //   How many days in the year he was born?
    //   How many decades old is he?
    //   What was the day of the week on his 21st birthday?
    LocalDate bennedict = LocalDate.of(1976, JULY, 19);
    System.out.println("Bennedict was born in a leap year: " + bennedict.isLeapYear());
    System.out.println("Days in the year he was born: " + bennedict.lengthOfYear());
    LocalDate now = LocalDate.now();
    System.out.println("Bennedict is " + bennedict.until(now, DECADES) + " decades old.");
    System.out.println("It was a " + bennedict.plusYears(21).getDayOfWeek() + " on his 21st birthday.");
    System.out.println("");

    // Train departs Boston at 1:45PM and arrives New York 7:25PM
    //   How many minutes long is the train ride?
    //   If the train was delayed 1 hour 19 minutes, what is the actual arrival time?
    LocalTime depart = LocalTime.of(13, 45);
    LocalTime arrive = LocalTime.of(19, 25);
    System.out.println("Planned Travel time:  " + depart.until(arrive, MINUTES) + " minutes");
    System.out.println("Delayed arrival time: " + arrive.plusHours(1).plusMinutes(19));
    System.out.println("");

    // Flight: Boston to Miami, leaves March 24th 9:15PM. Flight time is 4 hours 15 minutes
    //   When does it arrive in Miami?
    //   When does it arrive if the flight is delays 4 hours 27 minutes?
    LocalDateTime leaveBoston = LocalDateTime.of(2014, MARCH, 24, 21, 15);
    LocalDateTime arriveMiami = leaveBoston.plusHours(4).plusMinutes(15);
    System.out.println("The flight arrives in Miami: " + arriveMiami);
    System.out.println("The delayed arrival time is: " + arriveMiami.plusHours(4).plusMinutes(27));
    System.out.println("");

    // School semester starts the second Tuesday of September of this year.
    //   Hint: Look at the TemporalAdjusters class
    //   What is the date?
    //   School summer vacation starts June 25th
    //   Assuming:
    //     *  Two weeks off in December
    //     *  Two other vacation weeks
    //     *  School is taught Monday - Friday
    //   How many days of school are there?
    //   Hint: keep track of the short weeks also
    int excludeWeeks = 5;
    LocalDate schoolStarts = LocalDate.of(2014, SEPTEMBER, 1).with(TemporalAdjusters.firstInMonth(TUESDAY)).with(TemporalAdjusters.next(TUESDAY));
    LocalDate endOfFirstWeek = schoolStarts.with(TemporalAdjusters.next(FRIDAY));
    long firstWeekDays = schoolStarts.until(endOfFirstWeek, DAYS) + 1;
    System.out.println("School starts: " + schoolStarts);
    LocalDate schoolEnds = LocalDate.of(2015, JUNE, 25);
    System.out.println("School ends:   " + schoolEnds);
    long lastWeeksDays = 0;
    if (schoolEnds.getDayOfWeek() != MONDAY) {
      LocalDate lastWeekStart = schoolEnds.with(TemporalAdjusters.previous(MONDAY));
      lastWeeksDays = lastWeekStart.until(schoolEnds, DAYS) + 1;
      excludeWeeks++;
    }
    long days = ((schoolStarts.until(schoolEnds, WEEKS) - excludeWeeks) * 5); // 7 days per week, weekdays are 5/7 of a week.
    days = days + firstWeekDays + lastWeeksDays;
    System.out.println("Number of school days: " + days);
    System.out.println("");

    // A meeting is schedule for 1:30 PM next Tuesday. If today is Tuesday, assume it is today.
    //   What is the time of the week's meetings?
    LocalTime meetingTime = LocalTime.of(13, 30);
    LocalDate meetingDate = LocalDate.now().with(TemporalAdjusters.nextOrSame(TUESDAY));
    LocalDateTime meeting = LocalDateTime.of(meetingDate, meetingTime);
    System.out.println("The meeting time is: " + meeting);
    System.out.println("");

  }

}
