/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.example;


public class Controlflow {
    
enum Suit{
    SPADES,DIAMONDS,CLUBS,HEARTS
}
    
 public static void main(String args[])
    {
    
 Suit suit=Suit.HEARTS;

switch(suit)
{
case CLUBS:   
 System.out.print("club");   
break;    
case DIAMONDS:
    System.out.print("diamond");   
break;    
case HEARTS:
    System.out.print("diamond");   
break; 
case SPADES:	
    System.out.print("spades");   
break;   
default:	
assert false: suit;

    
    
}

}
}
