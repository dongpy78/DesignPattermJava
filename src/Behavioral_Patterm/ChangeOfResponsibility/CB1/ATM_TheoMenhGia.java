package Behavioral_Patterm.ChangeOfResponsibility.CB1;

public abstract class ATM_TheoMenhGia {
    int menhGia;
    public abstract ATM_TheoMenhGia menhGiaKeTiep(ATM_TheoMenhGia m);
    public abstract void rutTien(int soTien);

    public ATM_TheoMenhGia(int menhGia) {
        this.menhGia = menhGia;
    }

    public int getMenhGia() {
        return menhGia;
    }

    public void setMenhGia(int menhGia) {
        this.menhGia = menhGia;
    }
}
