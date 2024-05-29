package test_13_05_2024.observer.Topic;

import java.util.ArrayList;
import java.util.List;

public class ThanhVienB implements ITopicObserver{
    List<String> list = new ArrayList<>();
    public ThanhVienB() {
    }

    public void attach(Topic t) {
        t.attach(this);
    }

    public void dettach(Topic t) {
        t.detach(this);
    }

    @Override
    public void receiveNewTopic(String s) {
        list.add(s);
        for(int i = 0; i < list.size(); i++) {
            System.out.println("Tin: " + i + list.get(i));
        }
        System.out.println("Tin moi: " + s);
    }

    @Override
    public void updateTopic(int i, String s) {
        System.out.println("Tin duoc cap nhat o vi tri " + i + ": " + s);
    }
}
