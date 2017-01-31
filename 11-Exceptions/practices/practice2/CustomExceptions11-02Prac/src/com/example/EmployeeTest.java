package com.example;

public class EmployeeTest {
    
    public static void main(String[] args)  {
        Employee e1 = new Employee(0, "bob", "builder", 1250.50f);
        EmployeeImpl emp = new EmployeeImpl();
        emp.add(e1);
        Employee e2 = new Employee(1, "harry", "potter", 1250.50f);
        emp.add(e2);
        Employee e3 = new Employee(5, "harry", "potter", 1250.50f);
        emp.add(e3);
        Employee[] allEmps = emp.getAllEmployees();
        for (Employee employee : allEmps) {
            System.out.println(employee + "\n");
        }
        
      //emp.delete(7);
       
        
                }          
    
    
    
    }
