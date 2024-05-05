package BaiTapTuLuyen.LuyenTap.Observer.test_observer.bai_01;

import java.util.ArrayList;
import java.util.List;

public class Topic {
    List<ITopicObserver> observers = new ArrayList<>();
    public void attach(ITopicObserver observer) {
        observers.add(observer);
    }

    public void detach(ITopicObserver observer) {
        observers.remove(observer);
    }

    public void addTopic(String s) {
        for(var c: observers) {
            c.receiveNewTopic(s);
        }
    }

    public void updateTopic(int i, String s) {
        for (var c: observers) {
            c.updateTopic(i, s);
        }
    }
}
