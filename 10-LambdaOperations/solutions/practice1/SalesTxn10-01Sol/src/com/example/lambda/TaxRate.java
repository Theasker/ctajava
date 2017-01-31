package com.example.lambda;

/**
 *
 * @author oracle
 */
public enum TaxRate {  
    CA(0.09d),
    CO(0.08d),
    MA(0.09d);
    
    private final double rate;
    
    TaxRate(double rate){
        this.rate = rate;
    }
    
    public double getRate(){
        return rate;
    }
    
    public static double byState(State s){
        double rate = 0.0d;
        
        switch(s){
            case CA: rate = CA.getRate(); break;
            case CO: rate = CO.getRate(); break;
            case MA: rate = MA.getRate(); break;
        }
        
        return rate;
    }
        
   
 }
