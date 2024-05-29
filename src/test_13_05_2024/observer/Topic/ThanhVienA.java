package test_13_05_2024.observer.Topic;

public class ThanhVienA implements ITopicObserver{
    public ThanhVienA() {


    }

    public void attach(Topic t) {
        t.attach(this);
    }

    public void dettach(Topic t) {
        t.detach(this);
    }

    @Override
    public void receiveNewTopic(String s) {
        System.out.println("New topic: " + s);
    }

    @Override
    public void updateTopic(int i, String s) {
        System.out.println("Update topic: " + i + ": " + s);
    }
}
