
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

public class Manager extends Employee3 {

    private String deptName;

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }



    public Manager(String deptName, int empId, String name, String ssn, double salary) {
        super(empId, name, ssn, salary);
        this.deptName = deptName;
    }


}
