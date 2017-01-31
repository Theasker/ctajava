package com.example;

public class EmployeeTest {
    
    public static void main(String[] args) throws InvalidOperationException {
      EmployeeImpl empArr = new EmployeeImpl();
      
      Employee e1 = new Employee(0, "bob", "builder", 1250.50f);
      empArr.add(e1);
      
      Employee e2 = new Employee(1, "John", "Doe", 1250.50f);
      empArr.add(e2);
      
      Employee e3 = new Employee(5, "Jane", "Doe", 1350.50f);
      empArr.add(e3);
      
      Employee[] allEmps = empArr.getAllEmployees();
      for (Employee employee : allEmps) {
          System.out.println(employee + "\n");
      }
        
      
      Employee e = empArr.findById(5);
      if (e != null) {
          System.out.println(empArr + "\n");
      } else {
          System.out.println("\n\nEmployee  not found");     
      }          
    
      //empArr.delete(7);
    }
}