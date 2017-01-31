package com.example;

import com.example.domain.Employee;
import com.example.domain.Engineer;
import com.example.domain.Manager;
import com.example.domain.Admin;
import com.example.domain.Director;

public class EmployeeTest {

    public static void main(String[] args) {

        // Create the classes as per the practice
        Engineer eng = new Engineer(101, "Jane Smith", "012-34-5678", 120_345.27);

        Manager mgr = new Manager(207, "Barbara Johnson", "054-12-2367", 109_501.36, "US Marketing");

        Admin adm = new Admin(304, "Bill Munroe", "108-23-6509", 75_002.34);

        Director dir = new Director(12, "Susan Wheeler", "099-45-2340", 120_567.36, "Global Marketing", 1_000_000.00);

        eng.printEmployee();

        adm.printEmployee();
        mgr.printEmployee();
        dir.printEmployee();

        System.out.println("\nTesting raiseSalary and setName on Manager:");
        mgr.setName("Barbara Johnson-Smythe");
        mgr.raiseSalary(10_000.00);
        mgr.printEmployee();
    }

}
