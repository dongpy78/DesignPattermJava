package Behavioral_Patterm.Observer.CA5;

public class MainATM {
    public static void main(String[] args) {
        ATM atm = new ATM();
        TaiKhoan t1 = new TaiKhoan("Bui Van Dong", 1000, atm);
        TaiKhoan t2 = new TaiKhoan("Bui Trong Tai", 1200, atm);

        t1.duaTheVaoATM();
        System.out.println("Lan 1: ");
        atm.rutTien(300);
        System.out.println("Lan 2: ");
        atm.rutTien(800);
        t1.rutTheKhoiATM();
        System.out.println("Lan 3: ");
        atm.rutTien(800);
        t1.rutTheKhoiATM();

        System.out.println("Lan 4: ");
        t2.duaTheVaoATM();
        atm.rutTien(800);
        t2.rutTheKhoiATM();


    }
}
