package com.example;

import com.example.domain.Admin;
import com.example.domain.Director;
import com.example.domain.Employee;
import com.example.domain.Engineer;
import com.example.domain.Manager;

public class EmployeeTest {

    public static void main(String[] args) {
        //Employee emp = new Employee ();
        //emp.setEmpId(101);
        //emp.setName("Jane Smith");
        
        Engineer eng = new Engineer(101,"Jane Smith","012-34-5678",120_345.27);
        Manager man = new Manager(207,"Barbara Johnson", "054-12-2367",109_501.36,"US Marketing");
        Admin adm = new Admin(304,"Bil Munroe","108-23-6509", 75_002.34);
        Director emp = new Director(12, "Susan Wheeler", "099-45-2340", 120_567.36, "Global Marketing", 1_000_000.00);
        
        emp.printEmployee();
        emp.raiseSalary(1000);
        emp.setName("Mauri");
        
        
        //emp.setSsn ("012-34-5678");
        //emp.setSalary(120_345.27);
        
        System.out.println ("Employee id:         " + emp.getEmpId());
        System.out.println ("Employee name:       " + emp.getName());
        System.out.println ("Employee Soc Sec #:  " + emp.getSsn());
        System.out.println ("Employee salary:     " + emp.getSalary());
    }
}