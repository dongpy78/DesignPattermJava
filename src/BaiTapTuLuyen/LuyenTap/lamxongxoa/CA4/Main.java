package BaiTapTuLuyen.LuyenTap.lamxongxoa.CA4;

public class Main {
    public static void main(String[] args) {
        Topic t = new Topic();
        ThanhVienA a = new ThanhVienA();
        ThanhVienB b = new ThanhVienB();
        a.login(t);
        b.login(t);

        t.addTopic("Chuong 1");
        System.out.println("====================");
        t.addTopic("Chuong 2");
    }
}
