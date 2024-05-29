package test_13_05_2024.observer.CA2;

public class Button {
    IListenerOberser observers;
    public void attach(IListenerOberser observer) {
        if(observers == null) observers = observer;
    }

    public void click() {
        observers.onClick();
    }
}
