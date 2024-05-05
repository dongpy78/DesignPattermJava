package BaiTapTuLuyen.LuyenTap.Observer.test_observer.bai_01;

public class Main {
    public static void main(String[] args) {
        ThanhVienA a = new ThanhVienA();
        ThanhVienB b = new ThanhVienB();
        Topic t = new Topic();
        a.login(t);
        b.login(t);
        t.addTopic("Chương 1");
        System.out.println("======================");
        t.addTopic("Chương 2");



    }
}
