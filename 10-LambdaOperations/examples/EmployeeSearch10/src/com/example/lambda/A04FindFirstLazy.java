package com.example.lambda;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author oracle
 */
public class A04FindFirstLazy {
    
    public static void main(String[] args) {
        
        List<Employee> eList = Employee.createShortList();

        System.out.println("\n== CO Bonuses ==");
        eList.stream()
            .peek(e -> System.out.println("Stream start"))
            .filter(e -> e.getRole().equals(Role.EXECUTIVE))
            .peek(e -> System.out.println("Executives"))
            .filter(e -> e.getState().equals("CO"))
            .peek(e -> System.out.println("CO Executives"))
            .map(e -> e.getSalary() * Bonus.byRole(e.getRole()))
            .forEach( s -> System.out.printf(
              "  Bonus paid: $%,6.2f %n", s));
        
        System.out.println("\n== First CO Bonus ==");
        Employee tempEmp = new Employee.Builder().build();
        Optional<Employee> result = eList.stream()
            .peek(e -> System.out.println("Stream start"))
            .filter(e -> e.getRole().equals(Role.EXECUTIVE))
            .peek(e -> System.out.println("Executives"))
            .filter(e -> e.getState().equals("CO"))
            .peek(e -> System.out.println("CO Executives"))                
            .findFirst();
        
        if (result.isPresent()){
            result.get().printSummary();
        }     
    }  
}