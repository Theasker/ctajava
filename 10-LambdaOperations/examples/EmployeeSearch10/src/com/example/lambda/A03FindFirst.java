package com.example.lambda;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author oracle
 */
public class A03FindFirst {
    
    public static void main(String[] args) {
        
        List<Employee> eList = Employee.createShortList();
        
        System.out.println("\n== First CO Bonus ==");
        
        Optional<Employee> result = eList.stream()
            .filter(e -> e.getRole().equals(Role.EXECUTIVE))
            .filter(e -> e.getState().equals("CO"))
            .findFirst();
        
        if (result.isPresent()){
            result.get().print();
        }
        
    }
    
}
