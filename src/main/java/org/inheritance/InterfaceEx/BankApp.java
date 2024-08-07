package org.inheritance.InterfaceEx;

public class BankApp {
    public static void main(String[] args) {
        Account savings = new SavingsAccount("SA12345", 1000);
        Account checking = new CheckingAccount("CA12345", 500);

        savings.deposit(200);
        checking.withdraw(50);

        savings.applyMonthlyFee();
        checking.applyMonthlyFee();

        System.out.println("Savings Account Balance: " + savings.getBalance());
        System.out.println("Checking Account Balance: " + checking.getBalance());
    }
}
