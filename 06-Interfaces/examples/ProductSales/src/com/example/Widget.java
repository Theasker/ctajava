package com.example;

public class Widget {
  private String name = "Widget";
  private double salesPrice = 0;
  private double cost = 0;
  private long quantity = 0;
  
  public Widget(double salesPrice, double cost, long quantity){
    this.salesPrice = salesPrice;
    this.cost = cost;
    this.quantity = quantity;
  }
}
