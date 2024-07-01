package baitap_06_06.observer.atm;

public class ATM {
    IListenerATM tk;
    public void login(IListenerATM observer) {
        if(tk == null) tk = observer;
    }

    public void logout(IListenerATM observer) {
        if(tk != null) tk = null;
    }

    public boolean kiemTraRutTien(int withdrawal) {
        return tk.kiemTraSoDu(withdrawal);
    }

    public void rutTien(int withdrawal) {
        if(kiemTraRutTien(withdrawal))
            tk.nhanThongBao(true, withdrawal);
        else
            tk.nhanThongBao(false, 0);

    }
}
