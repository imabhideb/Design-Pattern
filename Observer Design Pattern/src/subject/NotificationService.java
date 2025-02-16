package subject;

import interfaces.Observer;
import interfaces.Subject;
import java.util.ArrayList;
import java.util.List;

public class NotificationService implements Subject{
    
    private List<Observer> observers;
    private String notificationMsg;

    public NotificationService() { 
        observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(notificationMsg);
        }
    }

    public void newNotification(String message) {
        this.notificationMsg = message;
        notifyObservers();
    }
    
}
