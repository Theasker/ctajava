package com.example;

public class BadManager extends Employee {
    private String deptName;

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public BadManager(int empId, String name, String ssn, double salary, String dept) {
      super(empId, name, ssn, salary);
      deptName = dept;
    }

/*
    @Override
    private String getDetails() {
      return super.getDetails () + 
        " Dept: " + deptName;
    }
*/
    
    @Override
    public String getAllDetails() {
      return super.getDetails () + 
        " Dept: " + deptName;
    }
}
