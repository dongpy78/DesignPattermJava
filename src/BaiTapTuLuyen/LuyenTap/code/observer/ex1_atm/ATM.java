package BaiTapTuLuyen.LuyenTap.code.observer.ex1_atm;

public class ATM {
    IListennerATM tk;

    public void login(IListennerATM iListennerATM) {
        if(tk == null) tk = iListennerATM;
    }

    public void logout(IListennerATM iListennerATM) {
        if(tk != null) tk = null;
    }

    public boolean kiemTraRutTien(int withdrawal) {
        return tk.kiemTraSoDu(withdrawal);
    }

    public void rutTien(int withdrawal) {
        if(kiemTraRutTien(withdrawal)) {
            tk.nhanThongBao(true, withdrawal);
        } else {
            tk.nhanThongBao(false, 0);
        }
    }
}
