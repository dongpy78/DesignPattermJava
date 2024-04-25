package Behavioral_Patterm.Observer.Bai_1;

public class Main {
    public static void main(String[] args) {
        TiGia t = new TiGia();
        NhaDauTuA a = new NhaDauTuA(t);
        NhaDauTuB b = new NhaDauTuB(t);
        a.dangKy();
        b.dangKy();
        System.out.println("Lan 1");
        t.capNhatTiGia(1);
        System.out.println("Lan 2");
        t.capNhatTiGia(-1);
        b.huyDangKy();
        System.out.println("Lan 3");
        t.capNhatTiGia(-1);
        b.huyDangKy();

        b.huyDangKy();


    }
}
