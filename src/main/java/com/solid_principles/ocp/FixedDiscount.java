package com.solid_principles.ocp;

/**
 * Applies a fixed discount.
 */
public class FixedDiscount implements DiscountCalculator {
    private double discountAmount;

    public FixedDiscount(double discountAmount) {
        this.discountAmount = discountAmount;
    }

    @Override
    public double calculateDiscount(double price) {
        return price - discountAmount;
    }
}
