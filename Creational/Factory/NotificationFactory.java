
public class NotificationFactory {
    Notification findNotification(String n) {
        if (n.equals("SMS")) {
            return new SMS();
        } else if (n.equals("Email")) {
            return new Email();
        } else if (n.equals("Whatsapp")) {
            return new Whatsapp();
        }
        return null;
    }
}
