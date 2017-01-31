package com.example;

import com.example.domain.Employee;
import com.example.domain.Engineer;
import java.text.NumberFormat;

public class EmployeeTest {

    public static void main(String[] args) {

        // Create the classes as per the practice
        Engineer eng = new Engineer(101, "Jane Smith", "012-34-5678", 120_345.27);
        Employee emp = new Employee(13, "Lionel Power", "099-90-6789", 67_990.90);

        // All engineers are employees hence upcasting is fine.
        // upcast ok with no explicit cast
        Employee obj = new Engineer(102, "Robert Stock", "012-54-7812", 220_345.27);


        // the following line results in compilation error.
        //As the method engineerMethod is undefined for the Employee Type
        //  obj.engineerMethod();
        eng.engineerMethod();
        printEmployee(obj);


        // the following linewon't compile, as downcast needs explicit casting
        //Engineer engobj = (Engineer)new Employee(1, "Brenda Wills", "013-78-5678", 221_500.00);
        //Every employee can't be Engineer so we have to be careful with downcasting
       //other wise it may throw ClassCastException at runtime.
        Engineer engobj =  new Engineer(1, "Brenda Wills", "013-78-5678", 221_500.00);


        printEmployee(engobj);
       
       


       // Employee cannot be a String
       //String s = (String) emp; // this line won't compile

    }

    public static void printEmployee(Employee emp) {
        System.out.println(); // Print a blank line as a separator
        // Print out the data in this Employee object
        System.out.println("Employee id:         " + emp.getEmpId());
        System.out.println("Employee name:       " + emp.getName());
        System.out.println("Employee Soc Sec #:  " + emp.getSsn());
        System.out.println("Employee salary:     " + NumberFormat.getCurrencyInstance().format((double) emp.getSalary()));
    }
}