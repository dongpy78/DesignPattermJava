package Creational_Patterm.Builder.test_builder;

public class MonHoc {
    String tenMonHoc;
    int soTinChi;
    String maMonHoc;

    public MonHoc(String tenMonHoc, int soTinChi, String maMonHoc) {
        this.tenMonHoc = tenMonHoc;
        this.soTinChi = soTinChi;
        this.maMonHoc = maMonHoc;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(" - Tên môn học: ").append(tenMonHoc)
                .append(" | Số tín chỉ: ").append(soTinChi)
                .append(" | Mã môn học: ").append(maMonHoc);
        return builder.toString();
    }

    public String getTenMonHoc() {
        return tenMonHoc;
    }

    public void setTenMonHoc(String tenMonHoc) {
        this.tenMonHoc = tenMonHoc;
    }

    public int getSoTinChi() {
        return soTinChi;
    }

    public void setSoTinChi(int soTinChi) {
        this.soTinChi = soTinChi;
    }

    public String getMaMonHoc() {
        return maMonHoc;
    }

    public void setMaMonHoc(String maMonHoc) {
        this.maMonHoc = maMonHoc;
    }
}
