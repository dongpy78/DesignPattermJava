package baitap_06_06.observer.CA4;

import java.util.ArrayList;
import java.util.List;

public class ThanhVienB implements IListenerObserver{
    List<String> list = new ArrayList<>();
    public ThanhVienB() {

    }
    public void login(Topic t) {
        t.attach(this);
    }

    public void logout(Topic t) {
        t.dettach(this);
    }

    @Override
    public void addNewTopic(String s) {
        list.add(s);
        for(int i = 0; i < list.size(); i++) {
            System.out.println("Topic " + (i+1) + ": " + list.get(i));
        }
        System.out.println("New topic: " + s);
    }

    @Override
    public void updateTopic(int i, String s) {
        list.set(i, s);
    }
}
