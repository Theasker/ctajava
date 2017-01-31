

package com.example;


public class Employee {


    public int empId;
    public String name;
    public String ssn;
    public  double salary;

    public Employee() {
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



