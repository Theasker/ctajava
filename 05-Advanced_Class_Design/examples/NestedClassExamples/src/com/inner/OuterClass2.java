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
public class OuterClass2 {
    int outerVariable = 100;
    static int staticOuterVariable = 200;
 
    static class StaticMemberClass {
        int innerVariable = 20;
         
        int getSum(int parameter) {
            // Cannot access outerVariable here
            return innerVariable + staticOuterVariable + parameter;
        }       
    }
     
    public static void main(String[] args) {
        OuterClass2 outer = new OuterClass2();
        StaticMemberClass inner = new StaticMemberClass(); 
        System.out.println(inner.getSum(3));
        outer.run();
    }
     
    void run() {
        StaticMemberClass localInner = new StaticMemberClass();
        System.out.println(localInner.getSum(5));
    }
    
}
