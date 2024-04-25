package Creational_Patterm.Builder.test_builder;

public class SinhVien {
    String hoTen;
    String maSinhVien;
    String queQuan;

    public SinhVien(String hoTen, String maSinhVien, String queQuan) {
        this.hoTen = hoTen;
        this.maSinhVien = maSinhVien;
        this.queQuan = queQuan;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        int i = 0;
        builder.append("Sinh viên ").append(++i).append(": ").append(hoTen);
        return builder.toString();
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
}