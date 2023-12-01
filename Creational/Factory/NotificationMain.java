
public class NotificationMain {
    public static void main(String[] args) {
        NotificationFactory nf = new NotificationFactory();
        Notification noti = nf.findNotification("Email");
        noti.Notify();
    }

}
