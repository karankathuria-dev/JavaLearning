package com.banking; // Make sure this package declaration is correct

public class Main {
    public static void main(String[] args) {
        // Create a BankAccount object
        BankAccount myAccount = new BankAccount("123456789", "John Doe", 1000.0);

        // Use the public methods to interact with the account
        myAccount.displayAccountInfo();

        myAccount.deposit(500.0);
        myAccount.withdraw(200.0);
        myAccount.displayAccountInfo();

        // Try invalid operations
        myAccount.deposit(-50.0);
        myAccount.withdraw(2000.0); // Insufficient funds
        myAccount.withdraw(-100.0);
        myAccount.displayAccountInfo();

        // Direct access is NOT allowed due to 'private' (try uncommenting this line to see error)
        // myAccount.balance = 50000.0; // This line would cause a compile-time error if uncommented!
    }
}