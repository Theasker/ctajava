/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.example;

/**
 *
 * @author anshenoy
 */
public class PassByValue {
    
    void callByValue(int x)
    {
        x=100;
    }
    
    public static void main(String args[])
    {
        int x=50;
        PassByValue pv= new PassByValue();
        pv.callByValue(x);
        System.out.println(x);
        
    }
}
