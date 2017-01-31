package com.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class TimeBetween {

  public static void main(String[] args) {
    // Create a formatter to accept date entries using the USA common standard,
    // month day, year = for example, April 8, 1970

    boolean validStr = false;
    
    // Create a formatter
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    while (!validStr) {
      System.out.print("Enter a date: ");
      try {
        String dateEntered = br.readLine();
        
        // Use the parse method with the formatter to create a date
        validStr = true;
      } catch (IOException | DateTimeParseException ex) {
        validStr = false;
      }
    }

    // Print the date out
    System.out.println("Date entered was: ");
    LocalDate now = LocalDate.now();
    
    // Calculate the years, months and days between now and the date entered

    // Print out the 
    int years = 0;
    int months = 0;
    int days = 0;
    System.out.println("There are " + years + " years, " 
            + months + " months, " 
            + days + " days between now and the date entered.");
  }
}