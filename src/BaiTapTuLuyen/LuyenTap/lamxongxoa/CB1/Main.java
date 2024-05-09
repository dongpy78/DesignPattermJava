package BaiTapTuLuyen.LuyenTap.lamxongxoa.CB1;

public class Main {
    public static void main(String[] args) {
        Abstract_MenhGiaATM m1 = new MenhGia(100);
        Abstract_MenhGiaATM m2 = new MenhGia(50);
        Abstract_MenhGiaATM m3 = new MenhGia(10);
        Abstract_MenhGiaATM m4 = new MenhGiaThapNhat(1);

        int soTien = 293;
        m1.menhGiaKeTiep(m2).menhGiaKeTiep(m3).menhGiaKeTiep(m4);
        m1.xuLy(soTien);
    }

}