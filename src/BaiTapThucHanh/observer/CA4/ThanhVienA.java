package BaiTapThucHanh.observer.CA4;

public class ThanhVienA implements TopicListener{
    Topic topic;
    public ThanhVienA() {
    }

    public void dangKy(Topic topic) {
        topic.dangKy(this);
    }

    public void huyDangKy(Topic topic) {
        topic.huyDangKy(this);
    }

    @Override
    public void listen(TinTuc t) {
        System.out.println("Tin nhan duoc o A: " + t.toString());
    }

    @Override
    public void update(int i, TinTuc t) {

    }
}
