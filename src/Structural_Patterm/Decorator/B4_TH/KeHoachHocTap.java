package Structural_Patterm.Decorator.B4_TH;

public abstract class KeHoachHocTap {
    String ten;
    String duongDan;

    public KeHoachHocTap(String ten) {
        this.ten = ten;
        this.duongDan = ten;
    }

    public abstract void addKeHoachHocTap(KeHoachHocTap k);

    public abstract void removeKeHoachHocTap(KeHoachHocTap k);

    public abstract int getSoTC();
    public abstract int getHocPhi();
    public abstract String getThongTin();

    public abstract String duongDan(String s);

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDuongDan() {
        return duongDan;
    }

    public void setDuongDan(String duongDan) {
        this.duongDan = duongDan;
    }
}
