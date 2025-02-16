import subject.NotificationService;
import observer.User;

public class Main {
    public static void main(String[] args) {
        // Create notification service
        NotificationService notificationService = new NotificationService();

        // Create users
        User a = new User("Abhi");
        User b = new User("Deb");
        User c = new User("Tom");
        User d = new User("Jerry");
        
        // Register user to the notifiation service
        notificationService.addObserver(a);
        notificationService.addObserver(b);
        notificationService.addObserver(c);
        notificationService.addObserver(d);

        // Publish notification
        notificationService.newNotification("Hey there's a new car in the town");

        // Unsubscribe Tom
        notificationService.removeObserver(c);
        notificationService.newNotification("Tom is a traitor"); 
    }
}
