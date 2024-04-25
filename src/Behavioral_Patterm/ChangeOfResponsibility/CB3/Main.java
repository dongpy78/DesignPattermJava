package Behavioral_Patterm.ChangeOfResponsibility.CB3;

public class Main {
    public static void main(String[] args) {
        TienDienBacThang t1 = new MucDienThongThuong("Bac 1", 0, 50, 1806);
        TienDienBacThang t2 = new MucDienThongThuong("Bac 2", 50, 100, 1866);
        TienDienBacThang t3 = new MucDienThongThuong("Bac 3", 100, 200, 2167);
        TienDienBacThang t4 = new MucDienThongThuong("Bac 4", 200, 300, 2729);
        TienDienBacThang t5 = new MucDienThongThuong("Bac 5", 300, 400, 3050);
        TienDienBacThang t6 = new BacCaoNhat("Bac 6", 400, 900, 3151);
        t1.tienTienMucTiepTheo(t2).tienTienMucTiepTheo(t3).tienTienMucTiepTheo(t4).tienTienMucTiepTheo(t5).tienTienMucTiepTheo(t6);
        int mucdien = 432;
        System.out.println("Muc dien su dung: " + mucdien + " - Tong tien dien la: " + t1.tinhTienDien(mucdien));
    }
}
