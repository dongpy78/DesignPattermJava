package baitap_05_06.observer.CA4;

public interface ITopicObserver {
    public void receiveNewTopic(String s);
    public void updateTopic(int i, String s);
}
