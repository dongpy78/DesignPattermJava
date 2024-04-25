package Behavioral_Patterm.ChangeOfResponsibility.CB3;

public abstract class TienDienBacThang {
    String tenbac;
    int min, max, gia;
    public abstract TienDienBacThang tienTienMucTiepTheo(TienDienBacThang m);
    public abstract int tinhTienDien(int soKw);

    public String getTenbac() {
        return tenbac;
    }

    public void setTenbac(String tenbac) {
        this.tenbac = tenbac;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public TienDienBacThang(String tenbac, int min, int max, int gia) {
        this.tenbac = tenbac;
        this.min = min;
        this.max = max;
        this.gia = gia;
    }
}
