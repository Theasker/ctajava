package com.example.domain;

import java.text.NumberFormat;

public class Employee {

    private int empId;
    private String name;
    private String ssn;
    private double salary;

    public Employee(int empId, String name, String ssn, double salary) {
        this.empId = empId;
        this.name = name;
        this.ssn = ssn;
        this.salary = salary;
    }
    
    public double raiseSalary(double inc){
        double salaryInc = this.salary + inc;
        return salaryInc;
    }

    public String printEmployee() {
        String temp;
        temp = NumberFormat.getCurrencyInstance().format((double)salary);

        return "Employee{" + "empId=" + empId + ", name=" + name + ", ssn=" + ssn + ", salary=" + temp + '}';
    }

    public int getEmpId() {
        return empId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSalary() {
        return salary;
    }
    public String getSsn() {
        return ssn;
    }
}
