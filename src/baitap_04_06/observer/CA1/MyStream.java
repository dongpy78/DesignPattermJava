package baitap_04_06.observer.CA1;

import java.util.ArrayList;
import java.util.List;

public class MyStream<T> {
    List<StreamListener> listeners = new ArrayList<>();

    public void addListener(StreamListener listener) {
        listeners.add(listener);
    }
    public void addEvent(T t) {
        for(var c: listeners)
            c.listen(t);
    }
}
