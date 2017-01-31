package com.example;

public class Main {

    public static void main(String args[]) {
        Contacts contact1 = new Contacts("bradley", "cooper", "1234567899");
        System.out.println(contact1);
        tryModification(contact1.getFirstName(), contact1.getLastName(), contact1.getMobileNo());

        System.out.println(contact1);
    }

    private static void tryModification(String fname, String lname, String mobile) {
        fname = "mike";
        lname = "peter";
        mobile = "99999999";
    }
}
