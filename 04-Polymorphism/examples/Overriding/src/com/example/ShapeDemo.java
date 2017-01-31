/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.example;




public class ShapeDemo {
  
  public static void main(String args[]) {
   
    Shape figref;

    figref = new Shape(10, 10);
    System.out.println("Area is " + figref.calculateArea());

    figref = new Rectangle(9, 5);
    System.out.println("Area is " + figref.calculateArea());

    figref = new Triangle(10, 8);
    System.out.println("Area is " + figref.calculateArea());
  } 
}
