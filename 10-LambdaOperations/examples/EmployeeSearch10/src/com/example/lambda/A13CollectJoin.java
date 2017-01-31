package com.example.lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author oracle
 */
public class A13CollectJoin {
    
    public static void main(String[] args) {
        
        List<Employee> eList = Employee.createShortList();
       
        // Collect CO Executives
        String deptList = eList.stream()
            .map(Employee::getDept)
            .distinct()
            .collect(Collectors.joining(", "));        

        System.out.println("\n== Dept List ==");
        System.out.println("Total: " + deptList);        
                
    }
    
}
