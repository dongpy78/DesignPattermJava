package onThiCuoiKy.observer.CA2;

public class Activity implements IListenerObserver {
    int dem = 0;
    @Override
    public void onClick() {
        dem++;
        System.out.println("Số lần click: " + dem);
    }
}
