package com.example.lambda;

/**
 *
 * @author oracle
 */
public enum BuyerClass {
    BASIC(0.0d),
    SILVER(0.01d),
    GOLD(0.02d),
    PLATINUM(0.03d);
    
    private final double rate;
    
    BuyerClass(double rate){
        this.rate = rate;
    }
    
    public double getRate(){
        return rate;
    }
    
}