/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

    interface CompStringLength {

        public void computeLength(String str);
    }

public class AnonymousClassDemo {
    static CompStringLength strlength = new CompStringLength() {

        @Override
        public void computeLength(String str) {
            int strlen = str.length();
            System.out.println("length of a string " + strlen);
        }
    };

    public static void main(String args[]) {
        strlength.computeLength("hello world");
        strlength.computeLength("java se 8 programming");
        strlength.computeLength("");
    }

}
