package Behavioral_Patterm.ChangeOfResponsibility.f888;

public class NhanVien extends NhanVienF88 {


    public NhanVien(String ten, String chucVu, int hangMucXuLyVay) {
        super(ten, chucVu, hangMucXuLyVay);
    }

    NhanVienF88 capTren;

    @Override
    public NhanVienF88 capCaoHon(NhanVienF88 nv) {
        capTren = nv;
        return capTren;
    }

    @Override
    public String xuLyKhoanVay(int tienVay) {
        if(tienVay <= hangMucXuLyVay) {
            StringBuilder builder = new StringBuilder();
            builder.append(chucVu).append(" ").append(ten).append(" Xử lý khoản vay ").append(tienVay);
            return builder.toString();
        }
        else return capTren.xuLyKhoanVay(tienVay);
    }
}
