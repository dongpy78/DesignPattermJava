package BaiTapTuLuyen.LuyenTap.code.observer.ex1_atm;

public class Main {
    public static void main(String[] args) {
        TaiKhoan tk1 = new TaiKhoan(100);
        ATM atm = new ATM();
        tk1.login(atm);
        atm.rutTien(30);
        System.out.println("Số tiền hiện có trong tài khoản của bạn: " + tk1.getSoDu());
    }
}
