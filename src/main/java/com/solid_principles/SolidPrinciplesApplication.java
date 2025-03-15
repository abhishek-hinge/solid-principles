package com.solid_principles;

import com.solid_principles.dip.EmailSender;
import com.solid_principles.dip.MessageSender;
import com.solid_principles.dip.NotificationService;
import com.solid_principles.isp.Workable;
import com.solid_principles.isp.Worker;
import com.solid_principles.lsp.FlyingBird;
import com.solid_principles.lsp.Sparrow;
import com.solid_principles.ocp.DiscountCalculator;
import com.solid_principles.ocp.PercentageDiscount;
import com.solid_principles.srp.Invoice;
import com.solid_principles.srp.InvoicePrinter;
import com.solid_principles.srp.InvoiceRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SolidPrinciplesApplication {

    public static void main(String[] args) {
        SpringApplication.run(SolidPrinciplesApplication.class, args);

        // SRP Example
        Invoice invoice = new Invoice("INV123", 500);
        InvoiceRepository repo = new InvoiceRepository();
        InvoicePrinter printer = new InvoicePrinter();
        repo.saveInvoice(invoice);
        printer.printInvoice(invoice);

        // OCP Example
        DiscountCalculator discount = new PercentageDiscount(10);
        System.out.println("Discounted Price: " + discount.calculateDiscount(100));

        // LSP Example
        FlyingBird sparrow = new Sparrow();
        sparrow.fly();

        // ISP Example
        Workable worker = new Worker();
        worker.work();

        // DIP Example
        MessageSender sender = new EmailSender();
        NotificationService notificationService = new NotificationService(sender);
        notificationService.notifyUser("Hello, user!");
    }

}


