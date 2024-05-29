package BaiTapThucHanh.observer.CA4;

public class Main {
    public static void main(String[] args) {
        TinTuc tinTuc = new TinTuc(1, "Bai 1");
        Topic topic = new Topic();
        ThanhVienA thanhVienA = new ThanhVienA();
        ThanhVienB thanhVienB = new ThanhVienB();
        topic.dangKy(thanhVienA);
        topic.dangKy(thanhVienB);
        topic.themMoi(tinTuc);
    }
}
