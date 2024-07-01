package baitap_06_06.observer.atm;

public class Main {
    public static void main(String[] args) {
        TaiKhoan tk = new TaiKhoan(200);
        ATM atm = new ATM();
        tk.login(atm);
        atm.rutTien(100);

    }
}
