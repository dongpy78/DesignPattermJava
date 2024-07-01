package baitap_05_06.observer.CA3;

import java.util.ArrayList;
import java.util.List;

public class TiGia {
    List<TiGiaObserver> observers = new ArrayList<>();
    public void attach(TiGiaObserver observer) {
        observers.add(observer);
    }
    public void detach(TiGiaObserver observer) {
        observers.remove(observer);
    }
    public void capNhatTiGia(float delta) {
        for(var c: observers) {
            c.update(delta);
        }
    }
}
