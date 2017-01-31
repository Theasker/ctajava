/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inner;

public class TestInner {

    public static void main(String args[]) {
        //create instance of outer class first:
        OuterClass outClass = new OuterClass();

         //create instance of inner class:
        OuterClass.InnerClass inner = outClass.new InnerClass();

        inner.accessOuter();
    }

}
