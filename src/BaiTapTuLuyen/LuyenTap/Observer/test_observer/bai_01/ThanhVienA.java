package BaiTapTuLuyen.LuyenTap.Observer.test_observer.bai_01;

public class ThanhVienA implements ITopicObserver {
    public ThanhVienA() {

    }

    public void login(Topic t) {
        t.attach(this);
    }

    public void logout(Topic t) {
        t.detach(this);
    }


    @Override
    public void receiveNewTopic(String s) {
        System.out.println("New topic: " + s);
    }

    @Override
    public void updateTopic(int i, String s) {
        System.out.println("Cập nhật topic " + i + ": " + s);
    }
}
