package com.example.lambda;

import java.util.List;

/**
 * @author Oracle
 * Streams and filters
 */
public class RoboMailTest01 {
  
  public static void main(String[] args) {
    
    List<Employee> pl = Employee.createShortList();
    RoboMail01 robo = new RoboMail01();

   
    System.out.println("\n==== RoboMail 01");
    System.out.println("\n=== Male Eng Under 65");
    
    //pl.stream().filter(salesExecutives).forEach(robo::roboMail);
    pl.stream()
            .filter(e -> e.getGender().equals(Gender.MALE))
            .filter(e -> e.getAge() < 65)
            .filter(e -> e.getDept().toUpperCase().equals("App"))
            .forEach(robo::roboMail);
    
    // Mail mail, Eng employees < 65

  }
}
