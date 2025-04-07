package edu.sharif.selab.services;

import edu.sharif.selab.models.EmailMessage;
import edu.sharif.selab.models.SmsMessage;
import edu.sharif.selab.models.TelegramMessage;

public class TelegramMessageService implements MessageService {
    @Override
    public void sendSmsMessage(SmsMessage smsMessage) {
        // Empty Body
    }

    @Override
    public void sendEmailMessage(EmailMessage emailMessage) {
        // Empty Body
    }

    @Override
    public void sendTelegramMessage(TelegramMessage telegramMessage) {
        System.out.println("Sending Telegram Message from user with identifier : " + telegramMessage.getSourceTelegramId() + "to user with identifier : " + telegramMessage.getTargetTelegramId());
        System.out.println("The message content is : " + telegramMessage.getContent());
    }

    public boolean validateTelegramIdentifier(String telegramIdentifier) {
        String PHONE_NUMBER_REGEX = "((\\(\\d{3}\\) ?)|(\\d{3}-))?\\d{3}-\\d{4}";
        if (telegramIdentifier.startsWith("@")) {
            // search for the user
            return true;
        } else return telegramIdentifier.matches(PHONE_NUMBER_REGEX);
    }
}
