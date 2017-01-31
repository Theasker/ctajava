/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

public class BankEMICalculator {

    private String CustomerName;
    private String AccountNo;
    private double loanAmount;

    double monthlypayment;
    private EMICalculatorHelper helper = new EMICalculatorHelper();

    public BankEMICalculator(String CustName, String AccNo, double loanAmt) {
        this.AccountNo = AccNo;
        this.CustomerName = CustName;
        this.loanAmount = loanAmt;

    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }

    public String getAccountNo() {
        return AccountNo;
    }

    public void setAccountNo(String AccountNo) {
        this.AccountNo = AccountNo;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public double getMonthlypayment() {
        return helper.calcMonthlyPayment(loanAmount);
    }

    public void setMonthlypayment(double monthlypayment) {
        this.monthlypayment = monthlypayment;
    }

    public EMICalculatorHelper getHelper() {
        return helper;
    }

    public void setHelper(EMICalculatorHelper helper) {
        this.helper = helper;
    }

    private class EMICalculatorHelper {

        int loanTerm = 60;
        double monthlyinterestRate = 0.9;
        double interestpermonth = monthlyinterestRate / loanTerm;

        protected double calcMonthlyPayment(double loanAmount) {
            double EMI = (loanAmount * interestpermonth) / ((1.0) - ((1.0) / Math.pow(1.0 + interestpermonth, loanTerm)));
            return (Math.round(EMI));
        }

    }
}
