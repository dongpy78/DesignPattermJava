package bai_tap.observer.CA2;

public class Activity implements IListenerObserver{
    int dem = 0;

    public void attach(Button button) {
        button.attach(this);
    }
    @Override
    public void onClick() {
        dem++;
        System.out.println("Số lần click là: " + dem);
    }
}
