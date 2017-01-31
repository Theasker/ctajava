package com.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class TimeBetween {

  public static void main(String[] args) {
    String dateFormat = "MMMM d, yyyy";
    LocalDate aDate = null;

    // 
    boolean validStr = false;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern(dateFormat);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    while (!validStr) {
      System.out.print("Enter a date: (" + dateFormat + "): ");
      try {
        String dateEntered = br.readLine();
        aDate = LocalDate.parse(dateEntered, formatter);
        validStr = true;
      } catch (IOException | DateTimeParseException ex) {
        validStr = false;
      }
    }

    System.out.println("Date entered: " + aDate.format(formatter));
    LocalDate now = LocalDate.now();
    Period between;
    if (aDate.isBefore(now)) {
      between = Period.between(aDate, now);
    } else {
      between = Period.between(now, aDate);
    }
    int years = between.getYears();
    int months = between.getMonths();
    int days = between.getDays();
    System.out.println("There are " + years + " years, " 
            + months + " months, " 
            + days + " days between now and the date entered.");
  }
}
