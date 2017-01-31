package com.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import static java.time.Month.*;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import static java.time.temporal.ChronoUnit.*;
import java.time.zone.ZoneOffsetTransition;

public class ZonedDateTimeExample {

  public static void main(String[] args) {
    ZoneId USEast = ZoneId.of("America/New_York");
    LocalDate date = LocalDate.of(2014, MARCH, 23);
    LocalTime time = LocalTime.of(9, 30);
    LocalDateTime dateTime = LocalDateTime.of(date, time);
    ZonedDateTime courseStart = ZonedDateTime.of(date, time, USEast);
    ZoneOffset offset = courseStart.getOffset();
    System.out.println("Zone offset: " + offset);
    ZonedDateTime hereNow = ZonedDateTime.now(USEast).truncatedTo(MINUTES);

    System.out.println("Here now:         " + hereNow);
    System.out.println("Course start:     " + courseStart);

    ZonedDateTime newCourseStart = courseStart.plusDays(2).minusMinutes(30);

    System.out.println("New Course Start: " + newCourseStart);
    System.out.println("");

    // Gaps/Overlaps
    // DST Begins March 9th, 2014
    LocalDate meetDate = LocalDate.of(2014, MARCH, 8);
    LocalTime meetTime = LocalTime.of(16, 00);
    ZonedDateTime meeting = ZonedDateTime.of(meetDate, meetTime, USEast);
    System.out.println("meeting time:     " + meeting);
    ZonedDateTime newMeeting = meeting.plusDays(1);
    System.out.println("new meeting time: " + newMeeting);
    System.out.println("");

    // Ask the rules if there was a gap or overlap
    //LocalDateTime lateNight = LocalDateTime.of(2014, NOVEMBER, 2, 1, 30);
    LocalDateTime lateNight = LocalDateTime.of(2014, MARCH, 9, 2, 30);
    System.out.println("Local meeting: " + lateNight);
    ZoneOffsetTransition zot = USEast.getRules().getTransition(lateNight);
    if (zot != null) {
      if (zot.isGap()) {
        System.out.println("gap");
      }
      if (zot.isOverlap()) {
        System.out.println("overlap");
      }
    }
    System.out.println("");

    // DST Ends November 2nd, 2014
    meetDate = LocalDate.of(2104, NOVEMBER, 1);
    meeting = ZonedDateTime.of(meetDate, meetTime, USEast);
    System.out.println("meeting time:     " + meeting);
    newMeeting = meeting.plusDays(1);
    System.out.println("new meeting time: " + newMeeting);
  }

}
