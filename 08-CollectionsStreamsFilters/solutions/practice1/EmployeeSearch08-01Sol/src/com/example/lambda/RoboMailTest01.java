package com.example.lambda;

import java.util.List;
import java.util.function.Predicate;

/**
 * @author Oracle
 * Streams and filters
 */
public class RoboMailTest01 {
  
  public static void main(String[] args) {
    
    List<Employee> pl = Employee.createShortList();
    RoboMail01 robo = new RoboMail01();

    Predicate<Employee> salesExecutives = 
      p -> p.getRole().equals(Role.EXECUTIVE) 
        && p.getDept().equals("Sales");
    
    Predicate<Employee> salesEmployeesOver50 = 
      p -> p.getAge() >= 50 && p.getDept().equals("Sales");
    
    System.out.println("\n==== RoboMail 01");
    System.out.println("\n=== Sales Execs");
    pl.stream()
        .filter(salesExecutives)
        .forEach(p -> robo.roboMail(p));
    
    pl.stream()
        .filter(salesExecutives)
        .forEach(p -> robo.roboText(p));    
    
    System.out.println("\n=== All Sales");
    pl.stream()
      .filter(salesEmployeesOver50)
      .forEach(p -> robo.roboMail(p));
    
    pl.stream()
        .filter(salesEmployeesOver50)
        .forEach(p -> robo.roboText(p));
  }
}
