
public class SubscriberOne implements Observer{
    @Override
    public void update(Message message) {
        System.out.println("SubscriberOne :: " + message.getMessage());
    }
}
