package BaiTapTuLuyen.ThucHanh.Phan_A.A1;

import java.util.ArrayList;
import java.util.List;

public class HoaDon {
    HoaDonHeader hoaDonHeader;
    List<ChiTietHoaDon> cthd = new ArrayList<>();

    protected HoaDon(Builder b) {
        this.hoaDonHeader = b.hoaDonHeader;
        this.cthd = b.ds_cthd;
    }

    @Override
    public String toString() {
        return "HoaDon{" +
                "hoaDonHeader=" + hoaDonHeader +
                ", cthd=" + cthd +
                '}';
    }

    public static class Builder {
        HoaDonHeader hoaDonHeader;
        List<ChiTietHoaDon> ds_cthd = new ArrayList<>();

        public Builder setHoaDonHeader(String maHoaDon, String ngayBan, String tenKhachHang) {
            this.hoaDonHeader = new HoaDonHeader(maHoaDon, ngayBan, tenKhachHang);
            return this;
        }

        public Builder setDs_cthd(String tenSanPham, int soLuong, double donGia, double chietKhau) {
            ds_cthd.add(new ChiTietHoaDon(tenSanPham, soLuong, donGia, chietKhau));
            return this;
        }

        public HoaDon build() {
            return new HoaDon(this);
        }
    }
}
