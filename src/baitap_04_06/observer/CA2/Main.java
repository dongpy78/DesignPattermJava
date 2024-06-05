package baitap_04_06.observer.CA2;

public class Main {
    public static void main(String[] args) {
        Button button = new Button();
        Activity activity = new Activity();
        activity.attach(button);
        button.click();
        button.click();
        button.click();
        button.click();

    }
}
