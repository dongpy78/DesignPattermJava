package BaiTapThucHanh.observer.CA2;

import java.util.ArrayList;
import java.util.List;

public class Button {
    IListenerObserver observers;
    public void login(IListenerObserver iListenerObserver) {
        if(observers == null) observers = iListenerObserver;
    }
    public void click() {
        observers.onClick();
    }
}
