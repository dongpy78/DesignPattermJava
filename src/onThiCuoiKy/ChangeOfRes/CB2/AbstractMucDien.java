package onThiCuoiKy.ChangeOfRes.CB2;

public abstract class AbstractMucDien {
    int min, max, gia;

    public AbstractMucDien(int min, int max, int gia) {
        this.min = min;
        this.max = max;
        this.gia = gia;
    }

    public abstract AbstractMucDien mucDienKeTiep(AbstractMucDien m);
    public abstract int xuLy(int soKw);
}
