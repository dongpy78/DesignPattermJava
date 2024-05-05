package BaiTapTuLuyen.LuyenTap.code.observer.ex_topic;

import java.util.ArrayList;
import java.util.List;

public class ThanhVienB implements ITopicObserver{
    List<String> list = new ArrayList<>();

    public ThanhVienB() {

    }

    public void login(Topic t) {
        t.attach(this);
        list.addAll(t.getTopics());
    }

    public void logout(Topic t) {
        t.detach(this);
    }

    @Override
    public void recieveNewTopic(String s) {
        list.add(s);
        for(int i = 0; i < list.size(); i++) {
            System.out.println("Tin " + i + 1 + ":" + list.get(i));
        }
        System.out.println("Tin moi" + s);
    }

    @Override
    public void updateTopic(int i, String s) {
        list.set(i, s);
        System.out.println("Tin duoc cap nhat o vi tri " + i + ": " + s);
    }
}
