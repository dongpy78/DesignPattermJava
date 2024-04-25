package BaiTapTuLuyen.ThucHanh.Phan_A.A1;

public class HoaDonHeader {
    private String maHoaDon, ngayBan, tenKhachHang;

    public HoaDonHeader(String maHoaDon, String ngayBan, String tenKhachHang) {
        this.maHoaDon = maHoaDon;
        this.ngayBan = ngayBan;
        this.tenKhachHang = tenKhachHang;
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public String getNgayBan() {
        return ngayBan;
    }

    public void setNgayBan(String ngayBan) {
        this.ngayBan = ngayBan;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    @Override
    public String toString() {
        return "HoaDonHeader{" +
                "maHoaDon='" + maHoaDon + '\'' +
                ", ngayBan='" + ngayBan + '\'' +
                ", tenKhachHang='" + tenKhachHang + '\'' +
                '}';
    }
}
