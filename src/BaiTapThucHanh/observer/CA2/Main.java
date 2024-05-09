package BaiTapThucHanh.observer.CA2;

public class Main {
    public static void main(String[] args) {
        Button button = new Button();
        Activity activity = new Activity();
        activity.login(button);
        button.click();
        button.click();
        button.click();
        button.click();
        button.click();
    }
}
