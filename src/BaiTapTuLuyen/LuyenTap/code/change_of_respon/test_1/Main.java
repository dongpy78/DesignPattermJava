package BaiTapTuLuyen.LuyenTap.code.change_of_respon.test_1;

public class Main {
    public static void main(String[] args) {
        AbstractMenhGiaATM m1 = new MenhGia(100);
        AbstractMenhGiaATM m2 = new MenhGia(50);
        AbstractMenhGiaATM m3 = new MenhGia(10);
        AbstractMenhGiaATM m4 = new MenhGia(1);
        m1.menhGiaKeTiep(m2).menhGiaKeTiep(m3).menhGiaKeTiep(m4);
        m1.xuLy(293);
    }
}
