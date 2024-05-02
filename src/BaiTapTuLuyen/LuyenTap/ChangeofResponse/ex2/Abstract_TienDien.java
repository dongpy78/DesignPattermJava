package BaiTapTuLuyen.LuyenTap.ChangeofResponse.ex2;

public abstract class Abstract_TienDien {
    String tenbac;
    int min, max, mucGia;

    public Abstract_TienDien(String tenbac, int min, int max, int mucGia) {
        this.tenbac = tenbac;
        this.min = min;
        this.max = max;
        this.mucGia = mucGia;
    }

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

    public int getMucGia() {
        return mucGia;
    }

    public void setMucGia(int mucGia) {
        this.mucGia = mucGia;
    }

    public abstract Abstract_TienDien tienDienMucKeTiep(Abstract_TienDien t);
    public abstract int xuLy(int sokw);
}
