package BaiTapTuLuyen.LuyenTap.code.observer.ex_topic;

public class Main {
    public static void main(String[] args) {
        ThanhVienA a = new ThanhVienA();
        ThanhVienB b = new ThanhVienB();
        Topic t = new Topic();
        a.login(t);
        b.login(t);

        t.addTopic("OOP");
        t.addTopic("OOP - aaaa");
        t.addTopic("OOP - bbb");
        System.out.println("---------------------");
        t.addTopic("DOP");
    }
}
