package com.example;

public interface AccountOperations {
    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }
    
    public abstract boolean withdraw(double amount);
    
    public abstract String getDescription();
}
