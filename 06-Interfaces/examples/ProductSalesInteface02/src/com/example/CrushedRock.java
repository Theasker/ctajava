package com.example;

public class CrushedRock implements SalesCalcs{
  private String name = "Crushed Rock";
  private double salesPrice = 0;
  private double cost = 0;
  private double weight = 0; // In pounds
  
  public CrushedRock(double salesPrice, double cost, double weight){
    this.salesPrice = salesPrice;
    this.cost = cost;
    this.weight = weight;
  }
  
  @Override
  public String getName(){
    return this.name;
  }
    
  @Override
  public double calcSalesPrice(){
    return this.salesPrice * this.weight;
  }
  
  @Override
  public double calcCost(){
    return this.cost * this.weight;
  }
  
  @Override
  public double calcProfit(){
    return this.calcSalesPrice() - this.calcCost();
  }
}
