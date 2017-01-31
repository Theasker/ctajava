package com.example.lambda;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author MikeW
 */
public class SalesTxn {
    private long txnId;
    private String salesPerson;
    private Buyer buyer;
    private String product;
    private String paymentType;
    private double unitPrice;
    private double unitCount;
    private LocalDate txnDate;
    private String city;
    private State state;
    private String code;
    
    public static class Builder{
    
        private long txnId = 0;
        private String salesPerson = "";
        private Buyer buyer;
        private String product = "";
        private String paymentType = "";
        private double unitPrice = 0;
        private double unitCount = 0;
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
        
        public SalesTxn.Builder buyer(Buyer val){
            this.buyer = val;
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
    buyer = builder.buyer;
    product = builder.product;
    paymentType = builder.paymentType;
    unitPrice = builder.unitPrice;
    unitCount = builder.unitCount;
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
  
  public Buyer getBuyer(){
    return buyer;
  }
  
  public String getBuyerName(){
    return buyer.getName();
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
  
  public double getTaxRate(){
      return TaxRate.byState(this.getState());
  }
  
  public double getDiscountRate(){
      return this.getBuyer().getBuyerClass().getRate();
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
  
  public String print(){
      return
        "Transaction id: " + txnId + "\n" +
        "Sales person: " + salesPerson + "\n" +
        "Buyer name: " + this.getBuyerName() + "\n" +
        "Buyer class: " + this.getBuyer().getBuyerClass() + "\n" +
        "Product: " + product + "\n" + 
        "Payment type: " + paymentType + "\n" +
        "Unit price: $" + unitPrice + "\n" +
        "Unit count: " + unitCount + "\n" +
        "Sales price: " + this.getTransactionTotal() + "\n" +
        "Tax rate: " + this.getTaxRate() + "\n" +
        "Discount rate: " + this.getDiscountRate() + "\n" +
        "Transaction date: " + txnDate + "\n" +
        "City: " + city + "\n" +
        "State: " + state + "\n" +
        "Code: " + code + "\n";
  } 

    public void printSummary(){
        System.out.println(
        "ID: " + txnId + " - " +
        "Seller: " + salesPerson + " - " +
        "Buyer: " + this.getBuyerName() + " - " +
        "Product: " + product + " - " + 
        "ST: " + state + " - " + 
        "Amt: " + this.getTransactionTotal() + " - " +
        "Date: " + txnDate);      
    }

    public String getSummaryStr(){
        return
        "ID: " + txnId + " - " +
        "Seller: " + salesPerson + " - " +
        "Buyer: " + this.getBuyerName() + " - " +
        "Product: " + product + " - " + 
        "ST: " + state + " - " + 
        "Amt: " + this.getTransactionTotal() + " - " +
        "Date: " + txnDate;      
    }


  @Override
  public String toString(){
    return "Transaction id: " + txnId +
        "Sales person: " + salesPerson +
        "Buyer name: " + this.getBuyerName() + 
        "Buyer class: " + this.getBuyer().getBuyerClass() +
        "Product: " + product + 
        "Payment type: " + paymentType +
        "Unit price: $" + unitPrice +
        "Unit count: " + unitCount +
        "Sales price: " + this.getTransactionTotal() + 
        "Tax rate: " + this.getTaxRate() +
        "Discount rate: " + this.getDiscountRate() +
        "Transaction date: " + txnDate +
        "City: " + city + 
        "State: " + state +
        "Code: " + code + "\n";
  } 

  public static List<SalesTxn> createTxnList(){
    List<SalesTxn> txnList = new ArrayList<>();
    Map<String, Buyer> buyerMap = Buyer.getBuyerMap();
    
    txnList.add(
      new SalesTxn.Builder()
            .txnId(11)
            .salesPerson("Jane Doe")
            .buyer(buyerMap.get("Acme"))
            .product("Widgets")
            .paymentType("Cash")
            .unitPrice(20)
            .unitCount(3000)
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
            .buyer(buyerMap.get("Acme"))
            .product("Widget Pro")
            .paymentType("Cash")
            .unitPrice(40)
            .unitCount(10000)
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
            .buyer(buyerMap.get("RadioHut"))
            .product("Widget Pro")
            .paymentType("Credit")
            .unitPrice(40)
            .unitCount(50000)
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
            .buyer(buyerMap.get("GreatDeals"))
            .product("Widget")
            .paymentType("Credit")
            .unitPrice(20)
            .unitCount(5000)
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
            .buyer(buyerMap.get("RadioHut"))
            .product("Widget Pro")
            .paymentType("Cash")
            .unitPrice(40)
            .unitCount(20000)
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
            .buyer(buyerMap.get("BestDeals"))
            .product("Widget")
            .paymentType("Cash")
            .unitPrice(20)
            .unitCount(25000)
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
            .buyer(buyerMap.get("PriceCo"))
            .product("Widget Pro")
            .paymentType("Credit")
            .unitPrice(40)
            .unitCount(6000)
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
            .buyer(buyerMap.get("PriceCo"))
            .product("Widget")
            .paymentType("Cash")
            .unitPrice(20)
            .unitCount(15000)
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
            .buyer(buyerMap.get("BestDeals"))
            .product("Widget Pro")
            .paymentType("Credit")
            .unitPrice(40)
            .unitCount(20000)
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
            .buyer(buyerMap.get("PriceCo"))
            .product("Widget")
            .paymentType("Cash")
            .unitPrice(20)
            .unitCount(14000)
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
            .buyer(buyerMap.get("PriceCo"))
            .product("Widget Pro")
            .paymentType("Cash")
            .unitPrice(40)
            .unitCount(16000)
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
            .buyer(buyerMap.get("MomAndPops"))
            .product("Widget")
            .paymentType("Cash")
            .unitPrice(20)
            .unitCount(3000)
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
            .buyer(buyerMap.get("RadioHut"))
            .product("Widget Pro")
            .paymentType("Cash")
            .unitPrice(40)
            .unitCount(26000)
            .txnDate(LocalDate.of(2013,12,8))
            .city("Boston")
            .state(State.MA)
            .code("02108")
            .build() 
    );
    
    
    return txnList;
  }
  
}
