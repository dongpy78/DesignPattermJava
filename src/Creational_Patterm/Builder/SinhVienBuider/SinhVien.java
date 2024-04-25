package Creational_Patterm.Builder.SinhVienBuider;

public class SinhVien {
    String hoTen;
    String maSV;
    String queQuan;

    public SinhVien(String hoTen, String maSV, String queQuan) {
        this.hoTen = hoTen;
        this.maSV = maSV;
        this.queQuan = queQuan;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Ho ten: ").append(hoTen);
        return builder.toString();
    }


    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }
}
