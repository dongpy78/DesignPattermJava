package baitap_05_06.observer.CA4;

import java.util.ArrayList;
import java.util.List;

public class ThanhVienB implements ITopicObserver {
    List<String> list = new ArrayList<>();
    public void attach(Topic topic) {
        topic.attach(this);
    }

    public void dettach(Topic topic) {
        topic.dettach(this);
    }
    @Override
    public void receiveNewTopic(String s) {
        list.add(s);
        for(int i = 0; i < list.size(); i++) {
            System.out.println("Tin " + (i+1) + ": " + list.get(i));
        }
        System.out.println("Tin moi: " + s);
    }

    @Override
    public void updateTopic(int i, String s) {
        list.set(i, s);
        System.out.println("Tin " + i + ": " + s);
    }
}
