package com.example.lambda;

import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;

/**
 *
 * @author oracle
 */
public class A10SortComparator {
  public static void main(String[] args) {
    List<Employee> eList = Employee.createShortList();
    
    System.out.println("\n== CO Bonus Details Comparator ==");
        
    eList.stream()
      .filter(e -> e.getRole().equals(Role.EXECUTIVE))
      .filter(e -> e.getState().equals("CO"))
      .sorted(Comparator.comparing(Employee::getSurName))
      .forEach(Employee::printSummary);        

    System.out.println("\n== CO Bonus Details Reversed ==");
        
    eList.stream()
      .filter(e -> e.getRole().equals(Role.EXECUTIVE))
      .filter(e -> e.getState().equals("CO"))
      .sorted(Comparator.comparing(Employee::getSurName).reversed())
      .forEach(Employee::printSummary);        
        
    System.out.println("\n== Two Level Sort, Dept then Surname ==");
        
    eList.stream()
      .sorted(
        Comparator.comparing(Employee::getDept)
          .thenComparing(Employee::getSurName))
      .forEach(Employee::printSummary);            
    }  
}
