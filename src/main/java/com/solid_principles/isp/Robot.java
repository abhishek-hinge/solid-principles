package com.solid_principles.isp;

/**
 * A robot only needs to work.
 */
public class Robot implements Workable {
    @Override
    public void work() {
        System.out.println("Robot is working.");
    }
}
