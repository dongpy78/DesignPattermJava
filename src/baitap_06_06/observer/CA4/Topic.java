package baitap_06_06.observer.CA4;

import java.util.ArrayList;
import java.util.List;

public class Topic {
    List<String> topics = new ArrayList<>();
    List<IListenerObserver> observers = new ArrayList<>();

    public void attach(IListenerObserver observer) {
        observers.add(observer);
    }
    public void dettach(IListenerObserver observer) {
        observers.remove(observer);
    }

    public void addTopic(String s) {
        for(var c: observers) {
            c.addNewTopic(s);
        }
    }

    public void updateTopic(int i, String s) {
        topics.set(i, s);
        for(var c: observers) {
            c.updateTopic(i, s);
        }
    }
}
