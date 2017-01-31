/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import static java.time.Month.*;
import static java.time.temporal.ChronoUnit.*;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 *
 * @author tmcginn
 */
public class InstantDurationPeriodExample {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) throws InterruptedException {
    // Instant
    Instant now = Instant.now();
    Thread.sleep(0, 1);
    Instant later = Instant.now();
    System.out.println("now is before later? " + now.isBefore(later));
    System.out.println("Now:   " + now);
    System.out.println("Later: " + later);
    System.out.println("");

    // Period
    Period oneDay = Period.ofDays(1);
    System.out.println("Period of one day: " + oneDay);
    LocalDateTime beforeDST = LocalDateTime.of(2014, MARCH, 8, 12, 00);
    ZonedDateTime newYorkTime = ZonedDateTime.of(beforeDST, ZoneId.of("America/New_York"));
    System.out.println("Before: " + newYorkTime);
    System.out.println("After:  " + newYorkTime.plus(oneDay));
    System.out.println("");

    // Duration
    Duration one24hourDay = Duration.ofDays(1);
    System.out.println("Duration of one day: " + one24hourDay);
    beforeDST = LocalDateTime.of(2014, MARCH, 8, 12, 00);
    newYorkTime = ZonedDateTime.of(beforeDST, ZoneId.of("America/New_York"));
    System.out.println("Before: " + newYorkTime);
    System.out.println("After:  " + newYorkTime.plus(one24hourDay));
    System.out.println("");
    
    // Temporal
    LocalDate christmas = LocalDate.of(2014, DECEMBER, 25);
    LocalDate today = LocalDate.now();
    long days = DAYS.between(today, christmas);
    System.out.println("There are " + days + " shopping days til Christmas");
    Period tilXMas = Period.between(today, christmas);
    System.out.println("There are " + tilXMas.getMonths() + " months and " + tilXMas.getDays() + " days til Christmas");
  }

}
