package baitap_05_06.observer.CA4;

public class Main {
    public static void main(String[] args) {
        ThanhVienA thanhVienA = new ThanhVienA();
        ThanhVienB thanhVienB = new ThanhVienB();
        Topic topic = new Topic();
        thanhVienA.attach(topic);
        thanhVienB.attach(topic);

        topic.addTopic("Chuong 1");
        topic.addTopic("Chuong 2");
        topic.addTopic("Chuong 3");
    }
}
