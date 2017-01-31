package com.example;

public interface AccountOperations {
    public double getBalance();
    public void deposit(double amount);
    public boolean withdraw(double amount);
    public String getDescription();
}
