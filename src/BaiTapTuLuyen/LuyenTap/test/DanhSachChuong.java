package BaiTapTuLuyen.LuyenTap.test;

public class DanhSachChuong {
    String chuongSach;

    public DanhSachChuong(String chuongSach) {
        this.chuongSach = chuongSach;
    }

    public String getChuongSach() {
        return chuongSach;
    }

    public void setChuongSach(String chuongSach) {
        this.chuongSach = chuongSach;
    }

    @Override
    public String toString() {
        return "DanhSachChuong{" +
                "chuongSach='" + chuongSach + '\'' +
                '}';
    }
}
