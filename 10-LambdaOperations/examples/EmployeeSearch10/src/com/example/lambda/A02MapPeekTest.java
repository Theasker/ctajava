package com.example.lambda;

import java.util.List;

/**
 *
 * @author oracle
 */
public class A02MapPeekTest {
    
    public static void main(String[] args) {

        List<Employee> eList = Employee.createShortList();
                
        System.out.println("\n== CO Bonuses ==");
        eList.stream()
            .filter(e -> e.getRole().equals(Role.EXECUTIVE))
            .filter(e -> e.getState().equals("CO"))
            .peek(e -> System.out.print("Name: " 
              + e.getGivenName() + " " + e.getSurName()))
            .map(e -> e.getSalary() * Bonus.byRole(e.getRole()))
            .forEach( s -> 
              System.out.printf(
                "  Bonus paid: $%,6.2f %n", s));
        
      
        System.out.println("\n== Manager Bonus Report ==");
        eList.stream()
            .filter(e -> e.getRole().equals(Role.MANAGER))
            .filter(e -> e.getDept().equals("Eng"))
            .peek(e -> System.out.print("Name: " 
              + e.getGivenName() + " " + e.getSurName()))
            .map(e -> e.getSalary() * Bonus.byRole(e.getRole()))
            .forEach( 
                s -> System.out.printf(
                  "  Bonus paid: $%,6.2f %n", s));
    }  
}