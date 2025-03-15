package com.solid_principles.ocp;

/**
 * Applies a percentage discount.
 */
public class PercentageDiscount implements DiscountCalculator {
    private double percentage;

    public PercentageDiscount(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public double calculateDiscount(double price) {
        return price - (price * percentage / 100);
    }
}
