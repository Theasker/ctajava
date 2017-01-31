package com.example;

public class TestSales {
  public static void main(String[] args) {
    CrushedRock rock1 = new CrushedRock(12, 10, 50);
    SalesCalcs rock2 = new CrushedRock(12, 10, 50);
    System.out.println("Sales Price: " + rock1.calcSalesPrice());
    System.out.println("Sales Price: " + rock2.calcSalesPrice());
    
    SalesCalcs[] itemList = new SalesCalcs[5];
    ItemReport report = new ItemReport();
    
    itemList[0] = new CrushedRock(12.0, 10.0, 50.0);
    itemList[1] = new CrushedRock(8.0, 6.0, 10.0);
    itemList[2] = new RedPaint(10.0, 8.0, 25.0);
    itemList[3] = new Widget(6.0, 5.0, 10);
    itemList[4] = new Widget(14.0, 12.0, 20);
    
    System.out.println("==Sales Report==");
    for(SalesCalcs item:itemList){
      report.printItemData(item);
    }
    
    
    
  }
}
