package baitap_06_06.observer.CA4;

public class ThanhVienA implements IListenerObserver {

    public ThanhVienA() {

    }

    public void login(Topic t) {
        t.attach(this);
    }

    public void logout(Topic t) {
        t.dettach(this);
    }

    @Override
    public void addNewTopic(String s) {
        System.out.println("New topic: " + s);
    }

    @Override
    public void updateTopic(int i, String s) {
        System.out.println("Update topic " + i + ": " + s);
    }
}
