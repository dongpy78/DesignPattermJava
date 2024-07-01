package baitap_05_06.observer.CA1;

import java.util.ArrayList;
import java.util.List;

public class Stream<T> {
    List<StreamData> observers = new ArrayList<>();
    public void addListener(StreamData observer) {
        observers.add(observer);
    }
    public void addEvent(T t) {
        for(var c: observers) {
            c.listen(t);
        }
    }

}
