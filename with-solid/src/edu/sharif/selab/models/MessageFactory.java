package edu.sharif.selab.models;

import java.security.InvalidParameterException;

public class MessageFactory {

    public static Message createMessage(int messageType) {
        switch (messageType) {
            case 1:
                // sms message
                return new SmsMessage();
            case 2:
                // email message
                return new EmailMessage();
            case 3:
                // telegram message
                return new TelegramMessage();
            default:
                throw new InvalidParameterException("invalid message type");

        }
    }

}
