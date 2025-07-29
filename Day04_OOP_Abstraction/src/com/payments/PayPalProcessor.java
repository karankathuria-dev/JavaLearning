package com.payments;

// Concrete subclass for PayPal payments
public class PayPalProcessor extends PaymentProcessor {
    private String email;

    public PayPalProcessor(String transactionId, double amount, String email) {
        super(transactionId, amount); // Call superclass constructor
        this.email = email;
    }

    @Override
    public void performPayment() {
        System.out.println("Processing PayPal payment for " + getAmount() +
                " using email: " + email);
        // Simulate PayPal API interaction
        System.out.println("PayPal payment successful.");
    }
}