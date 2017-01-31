package com.example;
import com.example.domain.Employee;

public class ObjectPassTest {
    public static void main(String[] args) {
        ObjectPassTest test = new ObjectPassTest();
        Employee x = new Employee ();
        x.setSalary(120_000.00);       
        test.foo(x);
        System.out.println ("Employee salary: " 
          + x.getSalary());
    }
    
    public void foo(Employee e){
      e.setSalary(130_000.00);
      e = new Employee();
      e.setSalary(140_000.00);
    }
}