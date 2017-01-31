package com.example.lambda;

import java.time.LocalDate;
import java.util.List;
import java.util.function.Supplier;

/**
 *
 * @author oracle
 */
public class SupplierTest {
  
  public static void main(String[] args) {
    
    List<Employee> eList = Employee.createShortList();
    Employee first = eList.get(0);
    
    Supplier<Employee> eSupp = 
        () -> new Employee.Builder()
            .givenName("Jill")
            .surName("Doe")
            .age(26)
            .gender(Gender.FEMALE)
            .role(Role.STAFF)
            .dept("Sales")
            .startDate(LocalDate.of(2012, 7, 14))
            .salary(45000)
            .email("jill.doe@example.com")
            .phoneNumber("202-123-4678")
            .address("33 3rd St")
            .city("Smallville")
            .state("KS")
            .code("12333")
        .build();
      
    System.out.println("=== Print employee list before");
    eList.stream().forEach(Employee::printSummary);
    
    eList.add(eSupp.get()); // Add new employee here
    
    System.out.println("\n=== Print employee list after");
    eList.stream().forEach(Employee::printSummary);
    
        
  }
}
