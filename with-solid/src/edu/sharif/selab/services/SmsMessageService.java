package edu.sharif.selab.services;

import edu.sharif.selab.models.EmailMessage;
import edu.sharif.selab.models.Message;
import edu.sharif.selab.models.SmsMessage;
import edu.sharif.selab.models.TelegramMessage;

import java.util.Scanner;

public class SmsMessageService implements MessageService {

    Scanner sc = new Scanner(System.in);

    @Override
    public void initMessage(Message message) {
        SmsMessage smsMessage = (SmsMessage) message;
        System.out.print("Enter source phone : ");
        String source = sc.next();
        smsMessage.setSourcePhoneNumber(source);
        System.out.print("Enter target phone : ");
        String target = sc.next();
        smsMessage.setTargetPhoneNumber(target);
        System.out.println("Write Your Message : ");
        String content = sc.next(".*$");
        smsMessage.setContent(content);
    }

    @Override
    public void sendMessage(Message message) {
        SmsMessage smsMessage = (SmsMessage) message;
        if (validatePhoneNumber(smsMessage.getSourcePhoneNumber()) && validatePhoneNumber(smsMessage.getTargetPhoneNumber())) {
            System.out.println("Sending a SMS from " + smsMessage.getSourcePhoneNumber() + " to " + smsMessage.getTargetPhoneNumber() + " with content : " + smsMessage.getContent());
        } else {
            throw new IllegalArgumentException("Phone Number is Not Correct!");
        }
    }

    private boolean validatePhoneNumber(String phoneNumber) {
        // Check if the phone number is exactly 11 characters long
        if (phoneNumber.length() != 11) {
            return false; // Phone number length is not valid
        }

        // Check if the phone number contains only numeric digits
        for (char digit : phoneNumber.toCharArray()) {
            if (!Character.isDigit(digit)) {
                return false; // Phone number contains non-numeric characters
            }
        }

        // If all checks pass, return true (valid phone number)
        return true;
    }
}
