package com.solid_principles.dip;


/**
 * Notification service depends on MessageSender abstraction.
 */
public class NotificationService {
    private final MessageSender messageSender;

    public NotificationService(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void notifyUser(String message) {
        messageSender.sendMessage(message);
    }
}

