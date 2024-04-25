package BaiTapTuLuyen.BaiTap.Builder;

public class SinhVien {
    private String hoTen;
    private String maSinhVien;
    private String queQuan;

    public SinhVien(String hoTen, String maSinhVien, String queQuan) {
        this.hoTen = hoTen;
        this.maSinhVien = maSinhVien;
        this.queQuan = queQuan;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Ten sinh vien: ").append(hoTen);
        return builder.toString();
    }
}
