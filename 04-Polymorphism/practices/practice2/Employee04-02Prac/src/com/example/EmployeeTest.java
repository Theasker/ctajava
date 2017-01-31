package com.example;

import com.example.domain.Employee;
import com.example.domain.Engineer;

import java.text.NumberFormat;

public class EmployeeTest {

    public static void main(String[] args) {

        // Create the classes as per the practice
        Engineer eng = new Engineer(101, "Jane Smith", "012-34-5678", 120_345.27);
        Employee emp = new Employee(13, "Lionel Power", "099-90-6789", 67_990.90);
        Employee obj = new Engineer(102, "Robert Stock", "012-54-7812", 220_345.27);

        eng.engineerMethod();
        printEmployee(obj);

        Employee engobj = new Engineer(1, "Brenda Wills", "013-78-5678", 221_500.00);
        printEmployee(engobj);

        String s = emp.toString();

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
