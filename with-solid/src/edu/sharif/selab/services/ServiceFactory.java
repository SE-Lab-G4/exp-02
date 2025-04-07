package edu.sharif.selab.services;

import java.security.InvalidParameterException;

public class ServiceFactory {

    public static MessageService createService(int serviceType) {
        switch (serviceType) {
            case 1:
                return new SmsMessageService();
            case 2:
                return new EmailMessageService();
            case 3:
                return new TelegramMessageService();
            default:
                throw new InvalidParameterException("Invalid service type");
        }
    }

}
