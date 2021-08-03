import java.util.ArrayList;
import java.util.List;

public class MessagePublisher implements Subject {

    private List<Observer> observers = new ArrayList<>();


    // add observer to subject
    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    //to remove observer from the subject
    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    //for each observer notify the event or update to subscribers
    @Override
    public void notify(Message message) {
        for(Observer observer: observers) {
            observer.update(message);
        }
    }
}