package BaiTapTuLuyen.LuyenTap.Observer.atm;

public class Main {
    public static void main(String[] args) {
        TaiKhoan tk = new TaiKhoan(100);
        ATM atm = new ATM();
        tk.login(atm);
        atm.rutTien(10);
        System.out.println(tk.getSoDu());
        atm.rutTien(100);
        System.out.println(tk.getSoDu());
        tk.logout(atm);
    }
}

