package BaiTapTuLuyen.LuyenTap.ChangeofResponse.ex1;

public abstract class Abstract_MenhGiaATM {
    int menhGia;

    public Abstract_MenhGiaATM(int menhGia) {
        this.menhGia = menhGia;
    }

    public int getMenhGia() {
        return menhGia;
    }

    public void setMenhGia(int menhGia) {
        this.menhGia = menhGia;
    }

    public abstract Abstract_MenhGiaATM menhGiaKeTiep(Abstract_MenhGiaATM m);
    public abstract void xuLy(int soTien);
}
