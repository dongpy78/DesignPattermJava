package BaiTapTuLuyen.LuyenTap.code.observer.ex1_atm;

public interface IListennerATM {
    public boolean kiemTraSoDu(int withdrawal);
    public void nhanThongBao(boolean qualified, int withdrawal);
}
