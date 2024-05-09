package Behavioral_Patterm.Observer.CA2;

public class Activity implements OnClickListener{
    private int clickCount = 0;

    public void login(Button button) {
        button.attach(this);
    }

    public void logout(Button button) {
        button.detach(this);
    }

    @Override
    public void onClick() {
        clickCount++;
        System.out.println("Bạn click lần thứ: " + clickCount);
    }
}
