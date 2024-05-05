package BaiTapTuLuyen.LuyenTap.code.observer.ex_topic;

import java.util.ArrayList;
import java.util.List;

public class Topic {
    List<String> topics = new ArrayList<>();
    List<ITopicObserver> observers = new ArrayList<>();

    public List<String> getTopics() {
        return topics;
    }

    public void setTopics(List<String> topics) {
        this.topics = topics;
    }

    public void attach(ITopicObserver observer) {
        observers.add(observer);
    }

    public void detach(ITopicObserver observer) {
        observers.remove(observer);
    }

    public void addTopic(String s) {
        topics.add(s);
        for(var c: observers) {
            c.recieveNewTopic(s);
        }
    }

    public void updateTopic(int i, String s) {
        topics.set(i, s);
        for(var c: observers) {
            c.updateTopic(i, s);
        }
    }



}
