package com.solid_principles.lsp;

/**
 * A Sparrow can fly and eat.
 */
public class Sparrow extends FlyingBird {
    @Override
    public void fly() {
        System.out.println("Sparrow is flying.");
    }
}
