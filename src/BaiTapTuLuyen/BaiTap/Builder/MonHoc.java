package BaiTapTuLuyen.BaiTap.Builder;

public class MonHoc {
    private String tenMonHoc;
    private int soTinChi;
    private String maMonHoc;

    public MonHoc(String tenMonHoc, int soTinChi, String maMonHoc) {
        this.tenMonHoc = tenMonHoc;
        this.soTinChi = soTinChi;
        this.maMonHoc = maMonHoc;
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

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Ten mon hoc: ").append(tenMonHoc).append("So tin chi: ").append(soTinChi).append("Ma mon hoc: ").append(maMonHoc);
        return builder.toString();
    }
}
