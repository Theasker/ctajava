package com.example;


public class CheckingAccount extends Account implements AccountOperations{
    
    private final double overDraftLimit;
    
public CheckingAccount(double balance) {
    this(balance, 0);
}
    
    public CheckingAccount(double balance, double overDraftLimit) {
        super(balance);
        this.overDraftLimit = overDraftLimit;
    }

    @Override
    public double getBalance(){
      return balance;
    }    
    
     @Override
     public void  deposit(double amount) {
       balance += amount;       
     }
     
    @Override
    public boolean withdraw(double amount) {
        if(amount <= balance + overDraftLimit) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String getDescription() {
        return "Checking Account";
    }
    
    @Override
    public String toString() {
        return this.getDescription() + " balance is " + balance;
    }    
}