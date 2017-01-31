/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

/**
 *
 * @author anshenoy
 */
public class EmployeeTest {

    public static void main(String args[]) {

        Employee3 emp1 = new Employee3(121, "Ron", "ab123", 5000);

        emp1.raiseSalary(1000);
       // emp1.empId=100;
        System.out.println("Details of Employee 1");
        String name = emp1.getName();
        String ssn = emp1.getSsn();
        double salary = emp1.getSalary();
        int id = emp1.getEmpId();
        System.out.println("Details of Employee 1");
        System.out.println("Name= " + name +" "+ "ssn= " + ssn +" "+ "salary= " + salary +" "+ "id " + id);
        Employee3 emp2 = new Employee3(122, "ken", "def123", 6000);

        emp2.raiseSalary(1500);
        emp2.changeName("David");

        System.out.println("Details of Employee 2");
        String name2 = emp2.getName();
        String ssn2 = emp2.getSsn();
        double salary2 = emp2.getSalary();
        int id2 = emp2.getEmpId();
        System.out.println("Name= " + name2 +" "+ "ssn= " + ssn2 +" "+ "salary= " + salary2+" "+ "id " + id2);
    }
}
