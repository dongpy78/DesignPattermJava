package BaiTapTuLuyen.LuyenTap.BaiTapLamThem.observer;

public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM();
        TaiKhoan taiKhoan = new TaiKhoan(100);
        taiKhoan.login(atm);
        atm.rutTien(50);

    }
}
