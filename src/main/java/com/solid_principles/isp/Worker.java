package com.solid_principles.isp;

/**
 * A worker can work and eat.
 */
public class Worker implements Workable, Eatable {
    @Override
    public void work() {
        System.out.println("Worker is working.");
    }

    @Override
    public void eat() {
        System.out.println("Worker is eating.");
    }
}
