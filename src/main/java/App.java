public class App {

    public static void main(String[] args) {
        SubscriberOne subscriberOne = new SubscriberOne();
        SubscriberTwo subscriberTwo = new SubscriberTwo();


        MessagePublisher messagePublisher = new MessagePublisher();

        messagePublisher.attach(subscriberOne);
        messagePublisher.attach(subscriberTwo);

        messagePublisher.notify(new Message("First message test, for both subscriber"));

        messagePublisher.detach(subscriberOne);
        messagePublisher.notify(new Message("Second test, only subscriberTwo will receive this message"));


    }

}
