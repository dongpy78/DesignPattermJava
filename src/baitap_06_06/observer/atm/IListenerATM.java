package baitap_06_06.observer.atm;

public interface IListenerATM {
    public boolean kiemTraSoDu(int withdrawal);
    public void nhanThongBao(boolean qualified, int withdrawal);
}
