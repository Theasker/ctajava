package com.example;

public class SavingsAccount extends Account implements AccountOperations{
     Double rateofinterest=0.06;

    public SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    public double getBalance(){
      return balance;
    }    

    @Override
    public boolean withdraw(double amount) {
        if(amount <= balance ) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }
    
     @Override
     public void  deposit(double amount) {
       balance += amount;
       balance +=balance * rateofinterest;
     }
    
    @Override
    public String getDescription() {
        return "Savings Account";
    }
    
    @Override
    public String toString() {
        return this.getDescription() + " balance is " + balance;
    }        
}
