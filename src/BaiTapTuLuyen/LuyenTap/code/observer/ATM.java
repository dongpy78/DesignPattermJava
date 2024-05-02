package BaiTapTuLuyen.LuyenTap.code.observer;

public class ATM {
    ITaiKhoanListener tk;

    public ATM() {

    }

    public ITaiKhoanListener getTk() {
        return tk;
    }

    public void setTk(ITaiKhoanListener tk) {
        this.tk = tk;
    }

    public void login(ITaiKhoanListener listener) {
        if(tk == null) tk = listener;
    }

    public void logout(ITaiKhoanListener listener) {
        if(tk != null) tk = null;
    }

    public boolean kiemTraTienRut(float tien_rut) {
        return tk.kiemTraSoDu(tien_rut);
    }

     public void rutTien(float tien_rut) {
        if(kiemTraTienRut(tien_rut)) tk.nhanThongBao(true, tien_rut);
        else tk.nhanThongBao(false, 0);
     }
}
