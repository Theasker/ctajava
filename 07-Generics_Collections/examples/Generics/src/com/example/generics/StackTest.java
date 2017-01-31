/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.example.generics;



    public class StackTest
    {
   
      public static void main(String[] args)
      {
       
         int[] integerElements = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

         
      Stack<Integer> integerStack = new Stack<>(10);  

       
     // push elements of integerElements onto integerStack
     testPushInteger(integerStack, integerElements);
       testPopInteger(integerStack); // pop from integerStack
      }

     
    // test push method with integer stack
   private static void testPushInteger(
      Stack<Integer> stack, int[] values)
  {
   System.out.printf("%nPushing elements onto integerStack%n");
 
  // push elements to Stack
        for (int value : values)
      {
        System.out.printf("%d ", value);
        stack.push(value); // push onto integerStack 
     }
     }

    // test pop method with integer stack
     private static void testPopInteger(Stack<Integer> stack)
   {      // pop elements from stack
       System.out.printf("%nPopping elements from integerStack%n");
          int popValue; // store element removed from stack
            // remove all elements from Stack
           while (true)
            {
             popValue = stack.pop(); // pop from intStack 
           System.out.printf("%d ", popValue);
           }
     
    }
 } // end class StackTest


    
