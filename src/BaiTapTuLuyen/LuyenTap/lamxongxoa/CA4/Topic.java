package BaiTapTuLuyen.LuyenTap.lamxongxoa.CA4;

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

    public void updateTopic(int i, String s) {
        for(var c: observers) {
            c.updateTopic(i, s);
        }
    }

    public void addTopic(String s) {
        for(var c: observers) {
            c.receiveNewTopic(s);
        }
    }


}
