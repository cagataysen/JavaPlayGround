package org.inheritance.InterfaceEx;

interface Account {
    void deposit(double amount);
    void withdraw(double amount);
    double getBalance();
    void applyMonthlyFee();
}

class SavingsAccount implements Account {
    private String accountNumber;
    private double balance;
    private static final double MONTHLY_FEE = 5.0;

    public SavingsAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void applyMonthlyFee() {
        withdraw(MONTHLY_FEE);
    }
}

class CheckingAccount implements Account {
    private String accountNumber;
    private double balance;
    private static final double MONTHLY_FEE = 10.0;

    public CheckingAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void applyMonthlyFee() {
        withdraw(MONTHLY_FEE);
    }
}

