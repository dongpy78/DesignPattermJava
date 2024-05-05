package BaiTapTuLuyen.LuyenTap.Observer.test_observer.bai_01;

import java.util.ArrayList;
import java.util.List;

public class ThanhVienB implements ITopicObserver{
    List<String> list = new ArrayList<>();

    public ThanhVienB() {
    }

    public void login(Topic t) {
        t.attach(this);
    }

    public void logout(Topic t) {
        t.detach(this);
    }
    @Override
    public void receiveNewTopic(String s) {
        list.add(s);
        for(int i = 0; i < list.size(); i++) {
            System.out.println("Topic " + i + ": " + list.get(i));
        }
        System.out.println("Tin mới: " + s);
    }

    @Override
    public void updateTopic(int i, String s) {
        System.out.println("Cập nhật topic: " + i + ": " + s  );
    }
}
