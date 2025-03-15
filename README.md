# SOLID Principles in Java 🚀

This repository demonstrates **SOLID principles** using simple Java examples.

## 📌 What is SOLID?
SOLID is a set of five design principles that improve **scalability, maintainability, and testability** in Object-Oriented Programming.

| Principle | Description |
|-----------|------------|
| **S** - Single Responsibility | A class should have **one** responsibility. |
| **O** - Open/Closed | A class should be **open for extension, closed for modification**. |
| **L** - Liskov Substitution | Subtypes must be **replaceable** for their base types. |
| **I** - Interface Segregation | Classes **should not be forced** to implement unused methods. |
| **D** - Dependency Inversion | **High-level modules** should depend on **abstractions, not concrete implementations**. |


## ✅ Implementation Overview
### **1️⃣ Single Responsibility Principle (SRP)**
**Example:** An `Invoice` class that handles only invoice data, while `InvoicePrinter` and `InvoiceRepository` manage printing and persistence separately.

### **2️⃣ Open/Closed Principle (OCP)**
**Example:** `DiscountCalculator` allows new discount types (`PercentageDiscount`, `FixedDiscount`) without modifying existing code.

### **3️⃣ Liskov Substitution Principle (LSP)**
**Example:** A `Bird` superclass ensures that subclasses like `Sparrow` (can fly) and `Penguin` (cannot fly) follow expected behavior.

### **4️⃣ Interface Segregation Principle (ISP)**
**Example:** Separate `Workable` and `Eatable` interfaces so that `Worker` implements both, while `Robot` implements only `Workable`.

### **5️⃣ Dependency Inversion Principle (DIP)**
**Example:** `NotificationService` depends on `MessageSender` (interface), allowing flexibility with implementations like `EmailSender`.

