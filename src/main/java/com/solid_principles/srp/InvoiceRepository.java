package com.solid_principles.srp;

/**
 * Handles saving invoices to a database (simulated with a print statement).
 */
public class InvoiceRepository {
    public void saveInvoice(Invoice invoice) {
        System.out.println("Invoice saved: " + invoice.getId());
    }
}