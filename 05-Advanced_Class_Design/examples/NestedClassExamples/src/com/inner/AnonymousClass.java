/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inner;

/**
 *
 * @author anshenoy
 */
public class AnonymousClass {

    public static void main(String[] args) {
        new OClass().print();
    }
}

class OClass {

    public void print() {
        final String s = "test: ";
//Anonymous class begins here
        System.out.println(new Object() {
            private int x = 1;
            private int y = 2;
            public String toString() {
                return s + "(" + x + "," + y + ")";
            }
        });
//Anonymous class ends here
    }
}
