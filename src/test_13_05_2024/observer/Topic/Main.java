package test_13_05_2024.observer.Topic;

public class Main {
    public static void main(String[] args) {
        ThanhVienA a = new ThanhVienA();
        ThanhVienB b = new ThanhVienB();
        Topic t = new Topic();
        a.attach(t);
        b.attach(t);

        t.addTopic("OOP");
        t.addTopic("OOP - aaaa");
        t.addTopic("OOP - bbb");
        System.out.println("---------------------");
        t.addTopic("DOP");
        t.addTopic("DOP");
    }
}
