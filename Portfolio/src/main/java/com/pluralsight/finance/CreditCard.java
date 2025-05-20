package com.pluralsight.finance;

// this class will implement Valuable interface
public class CreditCard implements Valuable{
    private String name;
    private String accountNumber;
    private double balance;

    // constructors
    public CreditCard(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // derived methods
    public void charge (double amount) {
        this.balance += amount;
    }

    public void pay (double amount) {
        this.balance -= amount;
    }

    // implementing interface method
    @Override
    public double getValue() {
        return 0;
    }
}
