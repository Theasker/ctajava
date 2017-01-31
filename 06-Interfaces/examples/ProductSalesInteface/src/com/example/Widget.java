package com.example;

public class Widget implements SalesCalcs{
  private String name = "Widget";
  private double salesPrice = 0;
  private double cost = 0;
  private long quantity = 0;
  
  public Widget(double salesPrice, double cost, long quantity){
    this.salesPrice = salesPrice;
    this.cost = cost;
    this.quantity = quantity;
  }
  
  @Override
  public String getName(){
    return this.name;
  }
    
  @Override
  public double calcSalesPrice(){
    return this.salesPrice * this.quantity;
  }
  
  @Override
  public double calcCost(){
    return this.cost * this.quantity;
  }
  
  @Override
  public double calcProfit(){
    return this.calcSalesPrice() - this.calcCost();
  }
}
