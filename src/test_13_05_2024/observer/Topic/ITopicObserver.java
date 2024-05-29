package test_13_05_2024.observer.Topic;

public interface ITopicObserver {
    public void receiveNewTopic(String s);
    public void updateTopic(int i, String s);
}
