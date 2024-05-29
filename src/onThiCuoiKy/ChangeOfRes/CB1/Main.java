package onThiCuoiKy.ChangeOfRes.CB1;

public class Main {
    public static void main(String[] args) {
        AbstractMenhGiaATM m1 = new MenhGia(50);
        AbstractMenhGiaATM m2 = new MenhGia(20);
        AbstractMenhGiaATM m3 = new MenhGia(10);
        AbstractMenhGiaATM m4 = new MenhGia(5);
        m1.menhGiaKeTiep(m2).menhGiaKeTiep(m3).menhGiaKeTiep(m4);
        m1.xuLy(85);
    }
}
