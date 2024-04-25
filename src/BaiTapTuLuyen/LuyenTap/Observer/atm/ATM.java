package BaiTapTuLuyen.LuyenTap.Observer.atm;


// Subject
public class ATM {
    ITaiKhoanListener tk;

    public ATM() {

    }

    public void login(ITaiKhoanListener listener) {
        if(tk == null) tk = listener;
    }

    public void logout(ITaiKhoanListener listener) {
        if(tk != null) tk = null;
    }


    public boolean kiemTraTienRut(float withdrawal) {
        return tk.kiemTraSoDu(withdrawal);
    }

    public void rutTien(float withdrawal) {
        if(kiemTraTienRut(withdrawal)) {
            tk.nhanThongBao(true, withdrawal);
        } else {
            tk.nhanThongBao(false, 0);
        }
    }
}
