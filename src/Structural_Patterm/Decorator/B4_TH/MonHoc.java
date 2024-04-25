package Structural_Patterm.Decorator.B4_TH;

public class MonHoc extends KeHoachHocTap {
    int soTC;
    int hocPhi;
    public MonHoc(String ten, int soTC, int hocPhi) {
        super(ten);
        this.soTC = soTC;
        this.hocPhi = hocPhi;
    }

    @Override
    public void addKeHoachHocTap(KeHoachHocTap k) {

    }

    @Override
    public void removeKeHoachHocTap(KeHoachHocTap k) {

    }

    @Override
    public int getSoTC() {
        return soTC;
    }

    @Override
    public int getHocPhi() {
        return hocPhi;
    }

    @Override
    public String getThongTin() {
        StringBuilder builder = new StringBuilder();
        builder.append("So tin chi: ").append(getSoTC()).append(" - Hoc Phi: ").append(getHocPhi());
        return builder.toString();
    }

    @Override
    public String duongDan(String s) {
        return s + " " + ten;
    }
}
