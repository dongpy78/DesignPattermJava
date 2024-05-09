package BaiTapTuLuyen.LuyenTap.lamxongxoa.CA4;

public class ThanhVienA implements ITopicObserver {
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
        System.out.println("Cập nhật topic: " + i + " :" + s);
    }
}
