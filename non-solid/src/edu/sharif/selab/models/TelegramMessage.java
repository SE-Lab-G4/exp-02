package edu.sharif.selab.models;


class TelegramIdentifier {
    private final String telegramId;
    private final String phoneNumber;

    public TelegramIdentifier(String identifier, boolean isPhoneNumber) {
        if (!isPhoneNumber) {
            this.telegramId = identifier;
            this.phoneNumber = null;
        } else {
            this.phoneNumber = identifier;
            this.telegramId = null;
        }
    }

    public String getTelegramId() {
        return telegramId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}


public class TelegramMessage extends Message {
    private TelegramIdentifier sourceTelegramId;
    private TelegramIdentifier targetTelegramId;
}
