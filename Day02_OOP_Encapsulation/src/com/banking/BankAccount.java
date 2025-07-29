package com.banking; // This should match your package name

public class BankAccount {
    // 1. Private Fields (Encapsulation: Data Hiding)
    private String accountNumber;
    private String accountHolderName;
    private double balance; // Initial balance

    // 2. Constructor (to initialize the object when created)
    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        // Basic validation for initial balance
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Initial balance cannot be negative. Setting to 0.");
            this.balance = 0;
        }
    }

    // 3. Public Getter Methods (Controlled Access to Data)
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    // 4. Public Methods to Modify Data (Controlled Behavior)
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount; // balance = balance + amount;
            System.out.println("Deposited: " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount; // balance = balance - amount;
            System.out.println("Withdrew: " + amount + ". New balance: " + balance);
        } else if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else {
            System.out.println("Insufficient funds. Current balance: " + balance);
        }
    }

    // Optional: A method to display account details
    public void displayAccountInfo() {
        System.out.println("\n--- Account Information ---");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Current Balance: " + balance);
        System.out.println("---------------------------\n");
    }
}