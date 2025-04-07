import edu.sharif.selab.models.Message;
import edu.sharif.selab.models.MessageFactory;
import edu.sharif.selab.services.ServiceFactory;
import edu.sharif.selab.services.MessageService;

import java.util.Scanner;

public class Main {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Hello and Welcome to SE Lab Messenger.");
        int serviceType;
        do {
            System.out.println("In order to send Sms message enter 1");
            System.out.println("In order to send Email message enter 2");
            System.out.println("In order to send Telegram message enter 3");
            System.out.println("In order to Exit, Enter 0");

            serviceType = scanner.nextInt();
            Message message = MessageFactory.createMessage(serviceType);
            MessageService service = ServiceFactory.createService(serviceType);

            if (serviceType == 0) {
                break;
            }

            service.initMessage(message);
            service.sendMessage(message);
        } while (true);
    }
}