package baitap_04_06.observer.CA2;



public class Button {
    IListenerObserver observers;
    public void attach(IListenerObserver observer) {
        if(observers == null) observers = observer;
    }

    public void click() {
        observers.onClick();
    }
}
