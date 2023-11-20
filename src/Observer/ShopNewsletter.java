package Observer;
import java.util.ArrayList;
import java.util.List;

public class ShopNewsletter {
    private List<Observer> subscribers = new ArrayList<>();

    public void subscribe(Observer subscriber) {
        subscribers.add(subscriber);
    }

    public void unsubscribe(Observer subscriber) {
        subscribers.remove(subscriber);
    }

    public void notifySubscribers(String message) {
        for (Observer subscriber : subscribers) {
            subscriber.update(message);
        }
    }
}
