package BaiTapTuLuyen.LuyenTap.code.observer.ex_topic;

public class ThanhVienA implements ITopicObserver{
    public ThanhVienA() {
    }

    public void login(Topic t) {
        t.attach(this);
    }

    public void logout(Topic t) {
        t.detach(this);
    }
    @Override
    public void recieveNewTopic(String s) {
        System.out.println("New topic: " + s);
    }

    @Override
    public void updateTopic(int i, String s) {
        System.out.println("Update topic" + i + ": " + s);
    }
}
