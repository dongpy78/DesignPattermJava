package BaiTapThucHanh.observer.CA1;

import java.util.ArrayList;
import java.util.List;

public class MyStream<T> {
    List<MyStreamListener> listeners = new ArrayList<>();

    public void addListener(MyStreamListener listener) {
        listeners.add(listener);
    }

    public void addEvent(T t) {
        for(var c: listeners) {
            c.listen(t);
        }
    }
}
