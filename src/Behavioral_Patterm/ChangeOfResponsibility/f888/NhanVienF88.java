package Behavioral_Patterm.ChangeOfResponsibility.f888;

public abstract class NhanVienF88 {

    public abstract NhanVienF88 capCaoHon(NhanVienF88 nv);

    public abstract String xuLyKhoanVay(int tienVay);

    String ten;
    String chucVu;
    int hangMucXuLyVay;




    public NhanVienF88(String ten, String chucVu, int hangMucXuLyVay) {
        this.ten = ten;
        this.chucVu = chucVu;
        this.hangMucXuLyVay = hangMucXuLyVay;
    }


}
