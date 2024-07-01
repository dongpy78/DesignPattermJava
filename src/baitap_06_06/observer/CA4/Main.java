package baitap_06_06.observer.CA4;

public class Main {
    public static void main(String[] args) {
        ThanhVienA thanhVienA = new ThanhVienA();
        ThanhVienB thanhVienB = new ThanhVienB();
        Topic topic = new Topic();
        thanhVienA.login(topic);
        thanhVienB.login(topic);
        topic.addTopic("Chuong 1");
        topic.addTopic("Chuong 2");
        topic.addTopic("Chuong 3");
        topic.addTopic("Chuong 4");
    }
}

