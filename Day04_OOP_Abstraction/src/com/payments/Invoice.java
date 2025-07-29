package com.payments;

public class Invoice implements Payable {
    private String invoiceId;
    private double totalAmountDue;
    private boolean isPaid;

    public Invoice(String invoiceId, double totalAmountDue) {
        this.invoiceId = invoiceId;
        this.totalAmountDue = totalAmountDue;
        this.isPaid = false;
    }

    @Override
    public void pay(double amount) {
        if (amount >= totalAmountDue && !isPaid) {
            System.out.println("Invoice " + invoiceId + " paid with " + amount);
            this.isPaid = true;
            this.totalAmountDue = 0; // No more due
        } else if (isPaid) {
            System.out.println("Invoice " + invoiceId + " was already paid.");
        } else {
            System.out.println("Amount " + amount + " is not sufficient to pay invoice " + invoiceId);
        }
    }

    @Override
    public String getPaymentDetails() {
        return "Invoice ID: " + invoiceId + ", Total Due: " + totalAmountDue + ", Paid: " + isPaid;
    }

    // Getter for invoiceId
    public String getInvoiceId() {
        return invoiceId;
    }

    // Method to check payment status
    public boolean isPaid() {
        return isPaid;
    }
}