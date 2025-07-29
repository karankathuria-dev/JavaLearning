package com.payments;

// Interface: defines a contract for payment-related operations
public interface Payable {
    void pay(double amount); // Abstract method
    String getPaymentDetails(); // Abstract method
}