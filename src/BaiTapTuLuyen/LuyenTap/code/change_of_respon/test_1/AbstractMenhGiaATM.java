package BaiTapTuLuyen.LuyenTap.code.change_of_respon.test_1;

public abstract class AbstractMenhGiaATM {
    int menhGia;

    public AbstractMenhGiaATM(int menhGia) {
        this.menhGia = menhGia;
    }

    public int getMenhGia() {
        return menhGia;
    }

    public void setMenhGia(int menhGia) {
        this.menhGia = menhGia;
    }

    public abstract AbstractMenhGiaATM menhGiaKeTiep(AbstractMenhGiaATM m);
    public abstract void xuLy(int soTien);
}
