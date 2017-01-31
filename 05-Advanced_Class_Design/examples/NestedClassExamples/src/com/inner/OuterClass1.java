/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inner;

public class OuterClass1 {

    int outerVariable = 100;

    class MemberClass {

        int innerVariable = 20;

        int getSum(int parameter) {
            return innerVariable + outerVariable + parameter;
        }
    }

    public static void main(String[] args) {
        OuterClass1 outer = new OuterClass1();
        MemberClass inner = outer.new MemberClass();
        System.out.println(inner.getSum(3));
        outer.run();
    }

    void run() {
        MemberClass localInner = new MemberClass();
        System.out.println(localInner.getSum(5));
    }
}
