package BaiTapTuLuyen.LuyenTap.Builder.A1;



import java.util.ArrayList;
import java.util.List;

public class HoaDon {
    HoaDonHeader hoaDonHeader;
    List<ChiTietHoaDon> cthd = new ArrayList<>();

    public static class Builder {
        HoaDonHeader hoaDonHeader;
        List<ChiTietHoaDon> ds_CTHD = new ArrayList<>();

        public Builder setHoaDonHeader(String maHoaDon, String ngayBan, String tenKhachHang) {
            this.hoaDonHeader = new HoaDonHeader(maHoaDon, ngayBan, tenKhachHang);
            return this;
        }

        public Builder setDs_CTHD(String tenSanPham, int soLuong, double donGia, double chietKhau) {
            this.ds_CTHD.add(new ChiTietHoaDon(tenSanPham, soLuong, donGia, chietKhau));
            return this;
        }
    }
}
