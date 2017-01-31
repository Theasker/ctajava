package com.example;

public interface BankOperations {

    public void addCustomer(String f, String l,Branch b);
    public int getNumOfCustomers();   
    public Customer getCustomer(int customerIndex);
    
    public default void generateReport() {

        // Print report header
        System.out.println("\t\t\tCUSTOMERS REPORT");
        System.out.println("\t\t\t================");

        // For each customer...
        for (int custIndex = 0; custIndex < this.getNumOfCustomers(); custIndex++) {
            Customer customer = this.getCustomer(custIndex);

            // Print the customer's name
            System.out.println();
            System.out.println("Customer: "
                    + customer.getLastName() + ", "
                    + customer.getFirstName()
                    + "\nBranch: " + customer.getBranch() + ", " 
                    + customer.getBranch().getServiceLevel());

            // For each account for this customer...
            for (int acctIndex = 0; acctIndex< customer.getNumOfAccounts(); acctIndex++) {
                AccountOperations account = customer.getAccount(acctIndex);

                // Print the current balance of the account
                System.out.println("    " + account);
            }
        }
    }
}
