package BaiTapThucHanh.observer.CA4;

import java.util.ArrayList;
import java.util.List;

public class ThanhVienB implements TopicListener{
    List<TinTuc> list = new ArrayList<>();
    public ThanhVienB() {

    }
    public void dangKy(Topic topic) {
        topic.dangKy(this);
    }
    public void huyDangKy(Topic topic) {
        topic.huyDangKy(this);
    }
    @Override
    public void listen(TinTuc t) {
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).getId() == t.getId()) {
                list.set(i, t);
                System.out.println(t.toString());
                return;
            }
        }
        list.add(t);
        System.out.println(t.toString());
    }

    @Override
    public void update(int i, TinTuc t) {

    }
}
