package com.example.lambda;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * @author MikeW
 */
public class SalesTxn {
    private long txnId;
    private String salesPerson;
    private String buyerName;
    private BuyerClass buyerClass;
    private String product;
    private String paymentType;
    private double unitPrice;
    private double unitCount;
    private TaxRate taxRate;
    private double discountRate;
    private LocalDate txnDate;
    private String city;
    private State state;
    private String code;
  
  
    public static class Builder{
    
        private long txnId = 0;
        private String salesPerson = "";
        private String buyerName = "";
        private BuyerClass buyerClass;
        private String product = "";
        private String paymentType = "";
        private double unitPrice = 0;
        private double unitCount = 0;
        private double discountRate = 0;
        private LocalDate txnDate = LocalDate.of(1, 1, 1);
        private String city = "";
        private State state;
        private String code = "";
       
        public SalesTxn.Builder txnId(long val){
            this.txnId = val;
            return this;
        }
        
        
        public SalesTxn.Builder salesPerson( String val){
            this.salesPerson = val;
            return this;
        }
        
        public SalesTxn.Builder buyerName(String val){
            this.buyerName = val;
            return this;
        }
        
        public SalesTxn.Builder buyerClass(BuyerClass val){
            this.buyerClass = val;
            return this;
        }
        
        public SalesTxn.Builder product(String val){
            this.product = val;
            return this;
        }

        
        public SalesTxn.Builder paymentType( String val){
            this.paymentType = val;
            return this;
        }

        public SalesTxn.Builder unitPrice(double val){
            this.unitPrice = val;
            return this;
        }

        public SalesTxn.Builder unitCount(double val){
            this.unitCount = val;
            return this;
        }
        

        public SalesTxn.Builder discountRate(double val){
            this.discountRate = val;
            return this;
        }

        public SalesTxn.Builder txnDate(LocalDate val){
            this.txnDate = val;
            return this;
        }    

        public SalesTxn.Builder city(String val){
          city = val;
          return this;
        }

        public SalesTxn.Builder state(State val){
          state = val;
          return this;
        }

        public SalesTxn.Builder code(String val){
          code = val;
          return this;
        }

        public SalesTxn build(){
          return new SalesTxn(this);
        }
  }
    
    private SalesTxn(){
        super();
    }
    
  private SalesTxn(SalesTxn.Builder builder){
    txnId = builder.txnId;
    salesPerson = builder.salesPerson;
    buyerName = builder.buyerName;
    buyerClass = builder.buyerClass;
    product = builder.product;
    paymentType = builder.paymentType;
    unitPrice = builder.unitPrice;
    unitCount = builder.unitCount;
    discountRate = builder.discountRate;
    txnDate = builder.txnDate;
    city = builder.city;
    state = builder.state;
    code = builder.code;
    
  }
  
    
  public long getTxnId(){
    return txnId;
  }
  
  public String getSalesPerson(){
    return salesPerson;
  }
  
  public String getBuyerName(){
    return buyerName;
  }
  
  public BuyerClass buyerClass(){
    return buyerClass;
  }
  
  public String getProduct(){
    return product;
  }
  
  public String getPaymentType(){
    return paymentType;
  }
  
  public double getUnitPrice(){
    return unitPrice;
  }
  
  public double getUnitCount(){
      return unitCount;
  }
  
  public double getDiscountRate(){
      return discountRate;
  }
  
  public LocalDate getTxnDate(){
      return txnDate;
  }
    
  public String getCity(){
      return city;
  }
  
  public State getState(){
      return state;
  }
  
  public String getCode(){
      return code;
  }
 
  public double getTransactionTotal(){
      return this.unitCount * this.unitPrice;
  }
 
  public static int sortByBuyer(SalesTxn a, SalesTxn b){
      return a.getBuyerName().compareTo(b.getBuyerName());
  }
  
  public void print(){
    System.out.println(
        "Transaction id: " + txnId + "\n" +
        "Sales person: " + salesPerson + "\n" +
        "Buyer name: " + buyerName + "\n" +
        "Buyer class: " + buyerClass + "\n" +
        "Product: " + product + "\n" + 
        "Payment type: " + paymentType + "\n" +
        "Unit price: $" + unitPrice + "\n" +
        "Unit count: " + unitCount + "\n" +
        "Sales price: " + this.getTransactionTotal() + "\n" +
        "Tax rate: " + taxRate + "\n" +
        "Discount rate: " + discountRate + "\n" +
        "Transaction date: " + txnDate + "\n" +
        "City: " + city + "\n" +
        "State: " + state + "\n" +
        "Code: " + code + "\n"
    );
  } 

    public void printSummary(){
    System.out.printf(
        "TxnId: " + txnId + " -- " +
        "Seller: " + salesPerson + " -- " +
        "Buyer: " + buyerName + " -- " +
        "Product: " + product + "%n" + 
        "ST: "+ state + " -- " +
        "Date: " + txnDate + " -- " +
        "Amt: $%,9.2f%n", this.getTransactionTotal()
        );
    }
    

  @Override
  public String toString(){
    return "Transaction id: " + txnId +
        "Sales person: " + salesPerson +
        "Buyer name: " + buyerName + 
        "Buyer class: " + buyerClass +
        "Product: " + product + 
        "Payment type: " + paymentType +
        "Unit price: $" + unitPrice +
        "Unit count: " + unitCount +
        "Sales price: " + this.getTransactionTotal() + "\n" +
        "Tax rate: " + taxRate +
        "Discount rate: " + discountRate +
        "Transaction date: " + txnDate +
        "City: " + city + 
        "State: " + state +
        "Code: " + code + "\n";
  } 

  public static List<SalesTxn> createTxnList(){
    List<SalesTxn> txnList = new ArrayList<>();
    
    txnList.add(
      new SalesTxn.Builder()
            .txnId(11)
            .salesPerson("Jane Doe")
            .buyerName("Acme Electronics")
            .buyerClass(BuyerClass.SILVER)
            .product("Widget")
            .paymentType("Cash")
            .unitPrice(20)
            .unitCount(3000)
            .discountRate(BuyerClass.SILVER.getRate())
            .txnDate(LocalDate.of(2013,1,25))
            .city("San Jose")
            .state(State.CA)
            .code("95101")
            .build() 
    );
    
    
    txnList.add(
      new SalesTxn.Builder()
            .txnId(12)
            .salesPerson("Jane Doe")
            .buyerName("Acme Electronics")
            .buyerClass(BuyerClass.SILVER)
            .product("Widget Pro")
            .paymentType("Cash")
            .unitPrice(40)
            .unitCount(10000)
            .discountRate(BuyerClass.SILVER.getRate())
            .txnDate(LocalDate.of(2013,4,5))
            .city("San Jose")
            .state(State.CA)
            .code("95101")
            .build() 
    );
    
    
    txnList.add(
      new SalesTxn.Builder()
            .txnId(13)
            .salesPerson("Jane Doe")
            .buyerName("Radio Hut")
            .buyerClass(BuyerClass.PLATINUM)
            .product("Widget Pro")
            .paymentType("Credit")
            .unitPrice(40)
            .unitCount(50000)
            .discountRate(BuyerClass.PLATINUM.getRate())
            .txnDate(LocalDate.of(2013,10,3))
            .city("San Jose")
            .state(State.CA)
            .code("95101")
            .build() 
    );
    
    txnList.add(
      new SalesTxn.Builder()
            .txnId(14)
            .salesPerson("John Smith")
            .buyerName("Best Deals")
            .buyerClass(BuyerClass.BASIC)
            .product("Widget")
            .paymentType("Credit")
            .unitPrice(20)
            .unitCount(5000)
            .discountRate(BuyerClass.BASIC.getRate())
            .txnDate(LocalDate.of(2013,10,10))
            .city("San Jose")
            .state(State.CA)
            .code("95101")
            .build() 
    );
    txnList.add(
      new SalesTxn.Builder()
            .txnId(15)
            .salesPerson("Betty Jones")
            .buyerName("Radio Hut")
            .buyerClass(BuyerClass.PLATINUM)
            .product("Widget Pro")
            .paymentType("Cash")
            .unitPrice(40)
            .unitCount(20000)
            .discountRate(BuyerClass.PLATINUM.getRate())
            .txnDate(LocalDate.of(2013,2,4))
            .city("Denver")
            .state(State.CO)
            .code("80216")
            .build() 
    );
    
    txnList.add(
      new SalesTxn.Builder()
            .txnId(16)
            .salesPerson("Betty Jones")
            .buyerName("Best Deals")
            .buyerClass(BuyerClass.GOLD)
            .product("Widget")
            .paymentType("Cash")
            .unitPrice(20)
            .unitCount(25000)
            .discountRate(BuyerClass.GOLD.getRate())
            .txnDate(LocalDate.of(2013,3,21))
            .city("Denver")
            .state(State.CO)
            .code("80216")
            .build() 
    );
    
    txnList.add(
      new SalesTxn.Builder()
            .txnId(17)
            .salesPerson("Dave Smith")
            .buyerName("PriceCo")
            .buyerClass(BuyerClass.SILVER)
            .product("Widget Pro")
            .paymentType("Credit")
            .unitPrice(40)
            .unitCount(6000)
            .discountRate(BuyerClass.SILVER.getRate())
            .txnDate(LocalDate.of(2013,3,20))
            .city("Denver")
            .state(State.CO)
            .code("80216")
            .build() 
    );
    
    
    txnList.add(
      new SalesTxn.Builder()
            .txnId(18)
            .salesPerson("Dave Smith")
            .buyerName("PriceCo")
            .buyerClass(BuyerClass.SILVER)
            .product("Widget")
            .paymentType("Cash")
            .unitPrice(20)
            .unitCount(15000)
            .discountRate(0.02)
            .txnDate(LocalDate.of(2013,3,30))
            .city("Denver")
            .state(State.CO)
            .code("80216")
            .build() 
    );
    txnList.add(
      new SalesTxn.Builder()
            .txnId(19)
            .salesPerson("Betty Jones")
            .buyerName("Best Deals")
            .buyerClass(BuyerClass.GOLD)
            .product("Widget Pro")
            .paymentType("Credit")
            .unitPrice(40)
            .unitCount(20000)
            .discountRate(BuyerClass.GOLD.getRate())
            .txnDate(LocalDate.of(2013,7,12))
            .city("Denver")
            .state(State.CO)
            .code("80216")
            .build() 
    );
    
    txnList.add(
      new SalesTxn.Builder()
            .txnId(20)
            .salesPerson("John Adams")
            .buyerName("PriceCo")
            .buyerClass(BuyerClass.SILVER)
            .product("Widget")
            .paymentType("Cash")
            .unitPrice(20)
            .unitCount(14000)
            .discountRate(BuyerClass.SILVER.getRate())
            .txnDate(LocalDate.of(2013,7,14))
            .city("Boston")
            .state(State.MA)
            .code("02108")
            .build() 
    );
    
    txnList.add(
      new SalesTxn.Builder()
            .txnId(21)
            .salesPerson("John Adams")
            .buyerName("PriceCo")
            .buyerClass(BuyerClass.SILVER)
            .product("Widget Pro")
            .paymentType("Cash")
            .unitPrice(40)
            .unitCount(16000)
            .discountRate(BuyerClass.SILVER.getRate())
            .txnDate(LocalDate.of(2013,10,6))
            .city("Boston")
            .state(State.MA)
            .code("02108")
            .build() 
    );
    
    txnList.add(
      new SalesTxn.Builder()
            .txnId(22)
            .salesPerson("Samuel Adams")
            .buyerName("Mom and Pops")
            .buyerClass(BuyerClass.BASIC)
            .product("Widget")
            .paymentType("Cash")
            .unitPrice(20)
            .unitCount(3000)
            .discountRate(0.01)
            .txnDate(LocalDate.of(2013,10,2))
            .city("Boston")
            .state(State.MA)
            .code("02108")
            .build() 
    );
    
    txnList.add(
      new SalesTxn.Builder()
            .txnId(23)
            .salesPerson("Samuel Adams")
            .buyerName("Radio Hut")
            .buyerClass(BuyerClass.PLATINUM)
            .product("Widget Pro")
            .paymentType("Cash")
            .unitPrice(40)
            .unitCount(26000)
            .discountRate(BuyerClass.PLATINUM.getRate())
            .txnDate(LocalDate.of(2013,12,8))
            .city("Boston")
            .state(State.MA)
            .code("02108")
            .build() 
    );
    
    txnList.add(
      new SalesTxn.Builder()
            .txnId(24)
            .salesPerson("Samuel Adams")
            .buyerName("Mom and Pops")
            .buyerClass(BuyerClass.BASIC)
            .product("Widget Pro")
            .paymentType("Cash")
            .unitPrice(38)
            .unitCount(2000)
            .discountRate(BuyerClass.BASIC.getRate())
            .txnDate(LocalDate.of(2013,10,4))
            .city("Boston")
            .state(State.MA)
            .code("02108")
            .build() 
    );
    
    
    return txnList;
  }
  
}
