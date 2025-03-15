package com.solid_principles.dip;

/**
 * Sends messages via email.
 */
public class EmailSender implements MessageSender {
    @Override
    public void sendMessage(String message) {
        System.out.println("Email sent: " + message);
    }
}