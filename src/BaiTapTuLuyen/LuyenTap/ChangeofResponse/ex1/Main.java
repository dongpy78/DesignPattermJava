package BaiTapTuLuyen.LuyenTap.ChangeofResponse.ex1;

public class Main {
    public static void main(String[] args) {
        Abstract_MenhGiaATM m1 = new MenhGia(20);
        Abstract_MenhGiaATM m2 = new MenhGia(10);
        Abstract_MenhGiaATM m3 = new MenhGia(5);
        Abstract_MenhGiaATM m4 = new MenhGia(2);
        m1.menhGiaKeTiep(m2).menhGiaKeTiep(m3).menhGiaKeTiep(m4);
        m1.xuLy(59);

    }
}
