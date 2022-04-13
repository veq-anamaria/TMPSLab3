package observer;
//observer
public interface Subscriber {
    public void update(Object o);

    void setNews(String news);
}
