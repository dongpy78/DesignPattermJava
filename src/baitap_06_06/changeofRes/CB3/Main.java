package baitap_06_06.changeofRes.CB3;

public class Main {
    public static void main(String[] args) {
        AbstractTinhTienDien m1 = new TienDien(0, 20, 30);
        AbstractTinhTienDien m2 = new TienDien(20, 30, 40);
        AbstractTinhTienDien m3 = new TienDien(40, 50, 50);
        m1.tienDienKeTiep(m2).tienDienKeTiep(m3);
        System.out.println(m1.xuLy(22));
    }
}
