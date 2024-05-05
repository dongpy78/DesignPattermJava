package BaiTapTuLuyen.LuyenTap.code.change_of_respon.test_2;

public abstract class AbstractMucDien {
    int min, max, gia;

    public AbstractMucDien(int min, int max, int gia) {
        this.min = min;
        this.max = max;
        this.gia = gia;
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

    public abstract AbstractMucDien mucDienKeTiep(AbstractMucDien m);
    public abstract int xuLy(int sokw);

}
