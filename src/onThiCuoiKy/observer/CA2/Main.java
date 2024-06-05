package onThiCuoiKy.observer.CA2;

public class Main {
    public static void main(String[] args) {
        Button button = new Button();
        Activity activity = new Activity();
        button.attach(activity);
        activity.onClick();
        activity.onClick();
        activity.onClick();
        activity.onClick();
        activity.onClick();
    }
}
