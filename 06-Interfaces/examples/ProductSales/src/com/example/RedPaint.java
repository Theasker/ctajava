package com.example;

public class RedPaint {
  private String name="Red Paint";
  private double salesPrice = 0;
  private double cost = 0;
  private double gallons = 0; // In pounds
  
  public RedPaint(double salesPrice, double cost, double gallons){
    this.salesPrice = salesPrice;
    this.cost = cost;
    this.gallons = gallons;
  }
}

