
public class SubscriberTwo implements Observer  {
    @Override
    public void update(Message message) {
        System.out.println("SubscriberTwo :: " + message.getMessage());
    }
}
