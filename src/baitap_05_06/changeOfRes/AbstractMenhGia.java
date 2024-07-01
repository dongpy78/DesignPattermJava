package baitap_05_06.changeOfRes;

public abstract class AbstractMenhGia {
    int menhGia;

    public AbstractMenhGia(int menhGia) {
        this.menhGia = menhGia;
    }

    public abstract AbstractMenhGia menhGiaKeTiep(AbstractMenhGia m);
    public abstract void xuLy(int soTien);
}
