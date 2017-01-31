package com.example;

public class Engineer extends Employee {

    private String technicalField;

    public String getTechnicalField() {
        return technicalField;
    }

    public void setTechField(String techField) {
        this.technicalField = techField;
    }

    public Engineer(int empId, String name, String ssn, double salary, String techField) {
      super(empId, name, ssn, salary);
      technicalField = techField;
    }

    @Override
    public String getDetails() {
      return super.getDetails () + 
        " Field: " + technicalField;
    }

    @Override
    public String getAllDetails() {
      return super.getDetails () + 
        " Field: " + technicalField;
    }
}
