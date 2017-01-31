package com.example;

public class CrushedRock {
  private String name;
  private double salesPrice = 0;
  private double cost = 0;
  private double weight = 0; // In pounds
  
  public CrushedRock(double salesPrice, double cost, double weight){
    this.salesPrice = salesPrice;
    this.cost = cost;
    this.weight = weight;
  }  
}
