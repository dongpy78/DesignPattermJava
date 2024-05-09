package Behavioral_Patterm.Observer.CA2;

public class Main {
    public static void main(String[] args) {
        Button button = new Button();
        Activity activity = new Activity();

        activity.login(button);
        button.onClick();
        button.onClick();

    }
}
