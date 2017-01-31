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
class OuterClass4 {

    public void print() {
        final String s = "test: ";

        class Point {

            private int x;
            private int y;

            public Point(int x, int y) {
                this.x = x;
                this.y = y;
            }

            public String toString() {
                return s + "(" + x + "," + y + ")";
            }
        };
        System.out.println(new Point(1, 2));
    } // method print
} // class OC

public class LocalClass {

    public static void main(String[] args) {
        new OuterClass4().print();
    }
}
