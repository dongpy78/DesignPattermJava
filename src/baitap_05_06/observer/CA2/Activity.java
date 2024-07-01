package baitap_05_06.observer.CA2;

public class Activity implements IListenerObserver {
    int dem = 0;
    public void attach(Button b) {
        b.attach(this);
    }
    @Override
    public void onClick() {
        dem++;
        System.out.println("So lan click: " + dem);
    }


}
