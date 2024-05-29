package test_13_05_2024.observer.CA2;

public class Main {
    public static void main(String[] args) {
        Activity activity = new Activity();
        Button button = new Button();
        activity.attach(button);

        button.click();
        button.click();
        button.click();
        button.click();
        button.click();
        button.click();
        button.click();
        button.click();
    }
}
