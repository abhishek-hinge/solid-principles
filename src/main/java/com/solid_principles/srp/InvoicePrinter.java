package com.solid_principles.srp;

/**
 * Handles printing invoices.
 */
public class InvoicePrinter {
    public void printInvoice(Invoice invoice) {
        System.out.println("Printing Invoice: ID=" + invoice.getId() + ", Amount=" + invoice.getAmount());
    }
}
