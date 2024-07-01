package baitap_06_06.changeofRes.CB3;

public abstract class AbstractTinhTienDien {
    int min, max, gia;

    public AbstractTinhTienDien(int min, int max, int gia) {
        this.min = min;
        this.max = max;
        this.gia = gia;
    }

    public abstract AbstractTinhTienDien tienDienKeTiep(AbstractTinhTienDien t);
    public abstract int xuLy(int sokw);
}
