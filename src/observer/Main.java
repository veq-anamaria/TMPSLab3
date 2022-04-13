package observer;


public class Main {
    public static void main(String[] args) {
        EmailList observable = new EmailList();
        NewsSubscriber observer = new NewsSubscriber();

        observable.addObserver(observer);
        observable.setNews("Reduceri");
    }
}
