package com.example.lambda;

import java.util.List;
import java.util.OptionalDouble;

/**
 *
 * @author oracle
 */
public class A09SortBonus {
  public static void main(String[] args) {
    List<Employee> eList = Employee.createShortList();
        
    System.out.println("\n== CO Bonus Details ==");
        
    eList.stream()
      .filter(e -> e.getRole().equals(Role.EXECUTIVE))
      .filter(e -> e.getState().equals("CO"))
      .mapToDouble(e -> e.getSalary() * Bonus.byRole(e.getRole()))
      .sorted()
      .forEach(d -> System.out.printf("Bonus paid: $%,6.2f %n", d));        
  }
}
