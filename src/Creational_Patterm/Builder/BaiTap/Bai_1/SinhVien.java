package Creational_Patterm.Builder.BaiTap.Bai_1;

public class SinhVien {
    String hoTenSV, maSinhVien, queQuan;

    public SinhVien(String hoTenSV, String maSinhVien, String queQuan) {
        this.hoTenSV = hoTenSV;
        this.maSinhVien = maSinhVien;
        this.queQuan = queQuan;
    }

    public String getHoTenSV() {
        return hoTenSV;
    }

    public void setHoTenSV(String hoTenSV) {
        this.hoTenSV = hoTenSV;
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
        builder.append("Ho ten: ").append(hoTenSV)
                .append(" | Ma sv: ").append(maSinhVien)
                .append(" | Que quan: ").append(queQuan);
        return builder.toString();
    }


}
