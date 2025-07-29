package com.payments;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Demonstrating Abstract Class (PaymentProcessor) ---");

        // Cannot instantiate abstract class directly:
        // PaymentProcessor processor = new PaymentProcessor("T123", 100.0); // This line would cause an error!

        // Use concrete subclasses
        CreditCardProcessor ccProcessor = new CreditCardProcessor("TXN001", 150.75, "1234-5678-9012-3456", "Karan Kathuria");
        PayPalProcessor ppProcessor = new PayPalProcessor("TXN002", 75.20, "karan.kathuria@example.com");

        ccProcessor.processTransaction(); // Calls abstract performPayment() of CreditCardProcessor
        System.out.println("Transaction ID: " + ccProcessor.getTransactionId()); // Inherited concrete method

        System.out.println("\n");
        ppProcessor.processTransaction(); // Calls abstract performPayment() of PayPalProcessor

        System.out.println("\n--- Demonstrating Interface (Payable) ---");

        // Create an Invoice object
        Invoice monthlyBill = new Invoice("INV2025-07-001", 250.0);
        System.out.println(monthlyBill.getPaymentDetails());
        monthlyBill.pay(100.0); // Not enough
        monthlyBill.pay(250.0); // Enough
        System.out.println(monthlyBill.getPaymentDetails());

        System.out.println("\n--- Polymorphism with Interfaces ---");
        // A list of Payable objects (can hold Invoices or any other class that implements Payable)
        List<Payable> itemsToPay = new ArrayList<>();
        itemsToPay.add(new Invoice("INV2025-07-002", 500.0));
        itemsToPay.add(new Invoice("INV2025-07-003", 120.50));

        for (Payable item : itemsToPay) {
            System.out.println("Processing item: " + item.getPaymentDetails());
            item.pay(item.getPaymentDetails().contains("INV2025-07-002") ? 500.0 : 120.50); // Pay the exact amount
        }
    }
}