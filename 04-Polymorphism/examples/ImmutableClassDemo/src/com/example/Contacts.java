/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

public final class Contacts {

    private final String firstName;
    private final String lastName;
    private final String mobileNo;

    public Contacts(String fname, String lname, String mobile) {
        this.firstName = fname;
        this.lastName = lname;
        this.mobileNo = mobile;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public String toString() {

        return firstName + " - " + lastName + " - " + mobileNo;

    }
}
