package org.inheritance.AbstractEx;

abstract class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Abstract method (must be implemented by subclasses)
    abstract void applyMonthlyFee();

    // Concrete method
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Concrete method
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    // Concrete method
    double getBalance() {
        return balance;
    }

    String getAccountNumber() {
        return accountNumber;
    }
}

class SavingsAccount extends Account {
    private static final double MONTHLY_FEE = 5.0;

    public SavingsAccount(String accountNumber, double initialBalance) {
        super(accountNumber, initialBalance);
    }

    @Override
    void applyMonthlyFee() {
        withdraw(MONTHLY_FEE);
    }
}

class CheckingAccount extends Account {
    private static final double MONTHLY_FEE = 10.0;

    public CheckingAccount(String accountNumber, double initialBalance) {
        super(accountNumber, initialBalance);
    }

    @Override
    void applyMonthlyFee() {
        withdraw(MONTHLY_FEE);
    }
}

