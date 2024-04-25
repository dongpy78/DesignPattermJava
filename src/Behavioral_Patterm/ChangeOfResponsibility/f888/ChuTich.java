package Behavioral_Patterm.ChangeOfResponsibility.f888;

public class ChuTich extends NhanVienF88 {


    public ChuTich(String ten, String chucVu, int hangMucXuLyVay) {
        super(ten, chucVu, hangMucXuLyVay);
    }

    @Override
    public NhanVienF88 capCaoHon(NhanVienF88 nv) {
        return null;
    }

    @Override
    public String xuLyKhoanVay(int tienVay) {
        return null;
    }
}
