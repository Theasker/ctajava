package com.example;

public class AbstractBankingMain {

    public static void main(String[] args) {
        Bank bank = new Bank();
        initializeCustomers(bank);

        // run the customer report
        CustomerReport report = new CustomerReport();
        report.setBank(bank);
        report.generateReport();
    }

    private static void initializeCustomers(Bank bank) {
        Customer customer;
// Create several customers and their accounts
        bank.addCustomer("Will", "Smith");
        customer = bank.getCustomer(0);
        customer.addAccount(new SavingsAccount(500.00));

        bank.addCustomer("Bradley", "Cooper");
        customer = bank.getCustomer(1);
        SavingsAccount sack = new SavingsAccount(500.00);
        customer.addAccount(sack);
        sack.deposit(500);

        bank.addCustomer("Jane", "Simms");
        customer = bank.getCustomer(2);
        customer.addAccount(new CheckingAccount(200.00, 400.00));

        bank.addCustomer("Owen", "Bryant");
        customer = bank.getCustomer(3);
        customer.addAccount(new CheckingAccount(200.00));

        bank.addCustomer("Tim", "Soley");
        customer = bank.getCustomer(4);
        customer.addAccount(new CheckingAccount(200.00));

        bank.addCustomer("Maria", "Soley");
        customer = bank.getCustomer(5);
        CheckingAccount chkAcct = new CheckingAccount(100.00);

        customer.addAccount(chkAcct);

        if (chkAcct.withdraw(900.00)) {
            customer.addAccount(chkAcct);
            System.out.print(" withdraw is successful" + chkAcct.getBalance());
        }

    }
}
