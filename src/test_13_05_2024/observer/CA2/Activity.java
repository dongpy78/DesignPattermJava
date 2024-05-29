package test_13_05_2024.observer.CA2;

public class Activity implements IListenerOberser {
    int dem = 0;
    public void attach(Button button) {
        button.attach(this);
    }
    @Override
    public void onClick() {
        dem++;
        System.out.println("So lan click! " + dem);
    }
}
