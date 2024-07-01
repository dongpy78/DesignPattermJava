package baitap_05_06.observer.CA4;

import java.util.ArrayList;
import java.util.List;

public class Topic {
    List<String> topics = new ArrayList<>();
    List<ITopicObserver> observers = new ArrayList<>();

    public void attach(ITopicObserver observer) {
        observers.add(observer);
    }

    public void dettach(ITopicObserver observer) {
        observers.remove(observer);
    }

    public void addTopic(String s) {
        topics.add(s);
        for(var c: observers) {
            c.receiveNewTopic(s);
        }
    }

    public void updateTopic(int i, String s) {
        topics.set(i, s);
        for(var c: observers) {
            c.updateTopic(i, s);
        }
    }
}
