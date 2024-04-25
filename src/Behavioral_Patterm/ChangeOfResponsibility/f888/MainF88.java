package Behavioral_Patterm.ChangeOfResponsibility.f888;

public class MainF88 {
    public static void main(String[] args) {
        NhanVienF88 bv = new NhanVien("A", "Bảo vệ", 1000000);
        NhanVienF88 tapVu = new NhanVien("B", "Tạp vụ", 5000000);
        NhanVienF88 vanPhong = new NhanVien("C", "Văn phòng", 2000000);
        NhanVienF88 truongPhong = new NhanVien("D", "Trưởng phòng", 8000000);
        NhanVienF88 giamDoc = new NhanVien("E", "Giám đốc", 9000000);
        NhanVienF88 chuTich = new ChuTich("E", "Giám đốc", 9000000);

        bv.capCaoHon(tapVu).capCaoHon(vanPhong).capCaoHon(truongPhong).capCaoHon(giamDoc).capCaoHon(chuTich);
        System.out.println(bv.xuLyKhoanVay(2000000));
    }
}
