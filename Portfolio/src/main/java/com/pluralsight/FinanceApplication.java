package com.pluralsight;

import com.pluralsight.finance.BankAccount;

public class FinanceApplication {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount("Pam", "123", 12500);
        BankAccount account2 = new BankAccount("Gary", "456", 1500);
        // try to deposit money into both accounts
        account1.deposit(100);
        account2.deposit(100);

        // printing out the balance for both accounts
        System.out.println(account1.getName() + "'s Account Balance: " + account1.getBalance());
        System.out.println(account2.getName() + "'s Account Balance: " + account2.getBalance());
    }
}
