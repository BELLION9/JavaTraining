package multithreading;
// lambda start join
interface EmailNotifier {
    default void notifyUser(String name) {
        System.out.println("Email sent to " + name);
    }
}
interface SMSNotifier {
    default void notifyUser(String name) {
        System.out.println("SMS sent to " + name);
    }
}
class EmployeeNotifier implements EmailNotifier, SMSNotifier {
    public void notifyUser(String name) {
        EmailNotifier.super.notifyUser(name);
        SMSNotifier.super.notifyUser(name);
    }
}
public class NotificationSystemDia {
    public static void main(String[] args) throws InterruptedException {
        EmployeeNotifier notifier = new EmployeeNotifier();
        Thread t1 = new Thread(() -> notifier.notifyUser("Krish"));
        Thread t2 = new Thread(() -> notifier.notifyUser("Nikhil"));
        t1.start();
        t1.join();
        t2.start();
        t2.join();
    }
}

