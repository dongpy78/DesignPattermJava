package BaiTapThucHanh.observer.CA2;

public class Activity implements IListenerObserver{
    int count = 0;

    public void login(Button button) {
        button.login(this);
    }

    @Override
    public void onClick() {
        count++;
        System.out.println("Số lần click: " + count);
    }
}
