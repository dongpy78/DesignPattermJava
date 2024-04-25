package BaiTapTuLuyen.LuyenTap.test2;

public class DanhSachChuong {
    String chuongSach;

    public DanhSachChuong(String chuongSach) {
        this.chuongSach = chuongSach;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Chuong sach: ").append(chuongSach);
        return builder.toString();
    }

    public String getChuongSach() {
        return chuongSach;
    }

    public void setChuongSach(String chuongSach) {
        this.chuongSach = chuongSach;
    }
}
