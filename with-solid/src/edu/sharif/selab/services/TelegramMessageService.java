package edu.sharif.selab.services;

import edu.sharif.selab.models.Message;
import edu.sharif.selab.models.TelegramMessage;

import java.util.Scanner;

public class TelegramMessageService implements MessageService {

    Scanner sc = new Scanner(System.in);

    @Override
    public void initMessage(Message message) {
        TelegramMessage telegramMessage = (TelegramMessage) message;
        System.out.print("Enter source identifier: ");
        String source = sc.next();
        telegramMessage.setSourceTelegramId(source);
        System.out.print("Enter target identifier: ");
        String target = sc.next();
        telegramMessage.setTargetTelegramId(target);
        System.out.println("Write Your Message : ");
        String content = sc.next();
        telegramMessage.setContent(content);
    }

    @Override
    public void sendMessage(Message message) {
        TelegramMessage telegramMessage = (TelegramMessage) message;
        System.out.println("Sending Telegram Message from user with identifier : " + telegramMessage.getSourceTelegramId() + " to user with identifier : " + telegramMessage.getTargetTelegramId());
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
