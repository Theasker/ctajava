package com.example;


public class Main {

    public static void main(String[] args) {
        
        // Create employees
        Employee jane = new Employee("Jane Doe", "Manager", "HR", 65000);
        Employee john = new Employee("John Doe", "Staff", "HR", 55000);
        
        System.out.println("Jane's witholding: " + jane.getWitholding());
        System.out.println("John's bonus " + john.getBonus());
        
//        BankEMICalculator acct1=new   BankEMICalculator("jane", "aa1234", 1000);
//        double EMIamt=acct1.getMonthlypayment();
//        System.out.print(EMIamt);
    }
    
}
