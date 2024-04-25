package BaiTapTuLuyen.LuyenTap.Builder.A1;

public class ChiTietHoaDon {
    String tenSanPham;
    int soLuong;
    double donGia;
    double chietKhau;

    public ChiTietHoaDon(String tenSanPham, int soLuong, double donGia, double chietKhau) {
        this.tenSanPham = tenSanPham;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.chietKhau = chietKhau;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Ten san pham: ").append(tenSanPham).append(" - ").append("So luong: ").append(soLuong)
                .append(" - ").append("Don gia: ").append(donGia).append(" - ")
                .append("Chiet khau").append(chietKhau);
        return builder.toString();
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getChietKhau() {
        return chietKhau;
    }

    public void setChietKhau(double chietKhau) {
        this.chietKhau = chietKhau;
    }
}
