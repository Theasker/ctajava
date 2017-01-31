package com.example.lambda;

import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author oracle
 */
public class A12CollectMath {
    
    public static void main(String[] args) {
        
        List<Employee> eList = Employee.createShortList();
       
        // Collect CO Executives
        double avgSalary = eList.stream()
            .filter(e -> e.getRole().equals(Role.EXECUTIVE))
            .filter(e -> e.getState().equals("CO"))
            .collect(
                Collectors.averagingDouble(Employee::getSalary));        

        System.out.println("\n== CO Exec Avg Salary ==");
        System.out.printf("Average: $%,9.2f %n", avgSalary);        
                
    }
    
}
