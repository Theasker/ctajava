package com.example;

public class Employee2 {

    private int empId;
    private String name;
    private String ssn;
    private double salary;

    public Employee2() {
    }

    public String getName() {
        return name;
    }

    public String getSsn() {
        return ssn;
    }

    public double getSalary() {
        return salary;
    }

   

    public int getEmpId() {
        return empId;
    }
    
    
    public void changeName(String newName) {
          if (newName != null) {
              this.name = newName;
          }
     }
 
     public void raiseSalary(double increase) {
         this.salary += increase;
     }
 }


