package com.example.lambda;

import java.util.List;

/**
 *
 * @author oracle
 */
public class A07CalcSum {
  public static void main(String[] args) {
    List<Employee> eList = Employee.createShortList();
        
    System.out.println("\n== Total CO Bonus ==");
    double result;
        
    result = eList.stream()
      .filter(e -> e.getRole().equals(Role.EXECUTIVE))
      .filter(e -> e.getState().equals("CO"))
      .mapToDouble(
          e -> e.getSalary() * Bonus.byRole(e.getRole()))
      .sum();
        
    System.out.printf("Total Bonuses paid: $%,6.2f %n", 
      result);

    System.out.println("\n== Total CO Bonus Details ==");
        
    result = eList.stream()
      .filter(e -> e.getRole().equals(Role.EXECUTIVE))
      .filter(e -> e.getState().equals("CO"))
      .peek(e -> System.out.print("Name: " 
        + e.getGivenName() + " " + e.getSurName() + " "))
      .mapToDouble(e -> e.getSalary() * Bonus.byRole(e.getRole()))
      .peek(d -> System.out.printf("Bonus paid: $%,6.2f %n", d))
      .sum();
        
    System.out.printf("Total Bonuses paid: $%,6.2f %n", result);    
  }  
}
