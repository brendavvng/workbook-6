package com.pluralsight.finance;

// this class will implement Valuable interface
public class BankAccount implements Valuable {
    private String name;
    private String accountNumber;
    private double balance;


    // constructors
    public BankAccount(String name, String accountNumber, double balance) {
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

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    // derived methods added
    public void deposit (double amount) {
        // balance += the amount for deposits
        this.balance += amount;
    }

    public void withdraw (double amount) {
        // balance -= the amount for withdraws
        this.balance -= amount;
    }

    // interface method implemented
    @Override
    public double getValue() {
        return balance;
    }
}
