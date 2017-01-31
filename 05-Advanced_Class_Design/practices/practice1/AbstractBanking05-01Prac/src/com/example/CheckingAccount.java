package com.example;

public class CheckingAccount extends Account{
 
    private final double overDraftLimit;

    public CheckingAccount(double balance, double overDraftLimit) {
        super(balance);
        this.overDraftLimit = overDraftLimit;
    }
    
    public CheckingAccount(double balance){
        super(balance);
        this.overDraftLimit = 0;
    }

    @Override
    public boolean withdraw(double amount) {
        if ((balance - amount) >= - overDraftLimit){
            return true;
        }else return false;
    }

    @Override
    public String getDescription() {
        return "Checking Account";
    }
    
}
