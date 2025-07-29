package com.payments;

// Concrete subclass for Credit Card payments
public class CreditCardProcessor extends PaymentProcessor {
    private String cardNumber;
    private String cardHolderName;

    public CreditCardProcessor(String transactionId, double amount, String cardNumber, String cardHolderName) {
        super(transactionId, amount); // Call superclass constructor
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }

    @Override
    public void performPayment() {
        System.out.println("Processing Credit Card payment for " + getAmount() +
                " using card " + cardNumber.substring(cardNumber.length() - 4) +
                " (holder: " + cardHolderName + ")");
        // Simulate payment gateway interaction
        System.out.println("Credit Card payment successful.");
    }
}