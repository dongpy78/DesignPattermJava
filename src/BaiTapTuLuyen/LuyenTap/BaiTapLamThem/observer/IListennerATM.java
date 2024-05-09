package BaiTapTuLuyen.LuyenTap.BaiTapLamThem.observer;

public interface IListennerATM {
    public boolean kiemTraSoDu(int withdrawal);
    public void nhanThongBao(boolean qualified, int withdrawal);
}
