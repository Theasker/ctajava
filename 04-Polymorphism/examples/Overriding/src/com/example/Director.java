package com.example;

public class Director extends Manager {

    private String groupName;

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String deptName) {
        this.groupName = groupName;
    }

    public Director(int empId, String name, String ssn, 
          double salary, String dept, String groupName) {
      super(empId, name, ssn, salary, dept);
      this.groupName = groupName;
    }

    @Override
    public String getDetails() {
      return super.getDetails () + 
        " Group: " + groupName;
    }

    @Override
    public String getAllDetails() {
      return super.getDetails () + 
        " Group: " + groupName;
    }
}
