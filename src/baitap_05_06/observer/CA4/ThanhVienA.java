package baitap_05_06.observer.CA4;

public class ThanhVienA implements ITopicObserver {
    public ThanhVienA() {

    }

    public void attach(Topic topic) {
        topic.attach(this);
    }

    public void dettach(Topic topic) {
        topic.dettach(this);
    }
    @Override
    public void receiveNewTopic(String s) {
        System.out.println("New topic: " + s);
    }

    @Override
    public void updateTopic(int i, String s) {
        System.out.println("Update topic " + i + ": " + s);
    }
}
