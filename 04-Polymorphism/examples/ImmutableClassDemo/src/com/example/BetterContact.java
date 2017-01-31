/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;


import java.util.Date;

public final class BetterContact {

    private String firstName;
    private String lastName;
    private Date dob;

    public BetterContact(String firstName, String lastName, Date dob) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = new Date(dob.getTime()); //Date ia mutable object, can be modified by using Date.setXXX() hence to prevent that
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getDob() {
        return dob;
    }
}