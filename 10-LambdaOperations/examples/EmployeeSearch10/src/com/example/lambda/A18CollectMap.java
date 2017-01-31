package com.example.lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author oracle
 */
public class A18CollectMap {
    
    public static void main(String[] args) {
        
        List<Employee> eList = Employee.createShortList();
        
        Map<String, String> gMap = new HashMap<>();
        Map<String, List<Employee>> deptMap = new HashMap<>();
       
        // Collect eMails and depts to a map
        gMap = eList.stream()
            .collect(Collectors.toMap(Employee::getEmail, 
                e -> e.getDept()));        

        System.out.println("\n== Emails and depts ==");
        gMap.forEach((k,v) -> {
            System.out.println("Email: " + k + " DeptName: " + v); 
            ;
        });
        
    }
    
}
