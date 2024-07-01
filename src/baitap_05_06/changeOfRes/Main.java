package baitap_05_06.changeOfRes;

public class Main {
    public static void main(String[] args) {
        AbstractMenhGia m1 = new MenhGia(50);
        AbstractMenhGia m2 = new MenhGia(20);
        AbstractMenhGia m3 = new MenhGia(10);
        AbstractMenhGia m4 = new MenhGia(5);
        m1.menhGiaKeTiep(m2).menhGiaKeTiep(m3).menhGiaKeTiep(m4);
        m1.xuLy(85);
    }
}
