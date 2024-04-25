package Behavioral_Patterm.ChangeOfResponsibility.CB1;

public class Main {
    public static void main(String[] args) {
        ATM_TheoMenhGia m1 = new MenhGia(500);
        ATM_TheoMenhGia m2 = new MenhGia(200);
        ATM_TheoMenhGia m3 = new MenhGia(500);
        ATM_TheoMenhGia m4 = new MenhGia(100);
        ATM_TheoMenhGia m5 = new MenhGia(50);
        ATM_TheoMenhGia m6 = new MenhGia(20);
        ATM_TheoMenhGia m7 = new MenhGia(10);
        ATM_TheoMenhGia m8 = new MenhGia(5);

        m1.menhGiaKeTiep(m2).menhGiaKeTiep(m3).menhGiaKeTiep(m4).menhGiaKeTiep(m5).menhGiaKeTiep(m6).menhGiaKeTiep(m7).menhGiaKeTiep(m8);

        m1.rutTien(1255);
    }
}
