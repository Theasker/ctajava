package com.example;

public class Customer {

    private String firstName;
    private String lastName;
    private AccountOperations[] accounts;
    private int numberOfAccounts;
    private Branch branch;

    public Customer(String f, String l,Branch b) {
        firstName = f;
        lastName = l;
        // initialize accounts array
        accounts = new AccountOperations[10];
        numberOfAccounts = 0;
        branch=b;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void addAccount(AccountOperations acct) {
        int i = numberOfAccounts++;
        accounts[i] = acct;
    }

    public int getNumOfAccounts() {
        return numberOfAccounts;
    }

    public AccountOperations getAccount(int accountIndex) {
        return accounts[accountIndex];
    }
    
    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

}