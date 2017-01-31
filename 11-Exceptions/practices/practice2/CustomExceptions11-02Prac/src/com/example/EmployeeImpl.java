package com.example;

import java.util.ArrayList;
import java.util.List;

public class EmployeeImpl {

    // not thread-safe
    private static Employee[] employeeArray = new Employee[10];

    // package level access
    EmployeeImpl() {
    }

    public void add(Employee emp) {

    }

    public void delete(int id) {

    }

    public Employee findById(int id) 
    {
        return employeeArray[id];
    }
    public Employee[] getAllEmployees() {
        List<Employee> emps = new ArrayList<>();
        // Iterate through the memory array and find Employee objects
        for (Employee e : employeeArray) {
            if (e != null) {
                emps.add(e);
            }
        }
        return emps.toArray(new Employee[0]);
    }

}
