package com.payments;

// Abstract Class: defines common behavior and abstract methods
public abstract class PaymentProcessor {
    private String transactionId;
    private double amount;

    public PaymentProcessor(String transactionId, double amount) {
        this.transactionId = transactionId;
        this.amount = amount;
    }

    // Concrete method: implemented in the abstract class itself
    public void processTransaction() {
        System.out.println("Initiating transaction " + transactionId + " for amount " + amount);
        // Call the abstract method that will be implemented by subclasses
        performPayment();
        System.out.println("Transaction " + transactionId + " completed.");
    }

    // Abstract method: must be implemented by any concrete subclass
    public abstract void performPayment();

    // Getters (for encapsulation, also inherited)
    public String getTransactionId() {
        return transactionId;
    }

    public double getAmount() {
        return amount;
    }
}