

package com.inner;


public class OuterClass {
     private int privInt = 10;
 
  
 public void createInnerClass() {

 InnerClass inClass = new InnerClass();
 inClass.accessOuter();
 }
 

 class InnerClass {  
   
  public void accessOuter() {

  System.out.println("The outer class's privInt is " + privInt);

  } 

 }

}
