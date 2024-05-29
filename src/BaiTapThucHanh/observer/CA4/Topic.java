package BaiTapThucHanh.observer.CA4;

import java.util.ArrayList;
import java.util.List;

public class Topic {
    List<TinTuc> list = new ArrayList<>();
    List<TopicListener> listeners = new ArrayList<>();

    // Dang ky, huy dang ky: tu viet
    public void dangKy(TopicListener observer) {
        listeners.add(observer);
    }

    public void huyDangKy(TopicListener observer) {
        listeners.remove(observer);
    }

    public void themMoi(TinTuc t) {
        list.add(t);
        for(var c: listeners) {
            c.listen(t);
        }
    }

//    public void update(int i, TinTuc t) {
//    }


}
