package com.pluralsight;

import com.pluralsight.finance.BankAccount;
import com.pluralsight.finance.Jewelry;
import com.pluralsight.finance.CreditCard;
import com.pluralsight.finance.Gold;
import com.pluralsight.finance.Portfolio;


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

        Portfolio portfolio = new Portfolio();

        portfolio.add(new CreditCard("Brenda's Credit Card", "200032", 10000));
        portfolio.add(new Jewelry("Gold Chain", 5000));

        System.out.println("Total Net Worth: " + portfolio.getValue());
    }
}
