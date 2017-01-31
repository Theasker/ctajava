package com.example;

public class Invariant {

    static void checkNum(int num) {
        int x = num;

        if (x > 0) {
            System.out.print( "number is positive" + x);

        } else if (x == 0) {
            System.out.print("number is zero" + x);
        } else {
            assert (x > 0);
        }
    }

    public static void main(String args[]) {

        checkNum(-4);
    }

}
