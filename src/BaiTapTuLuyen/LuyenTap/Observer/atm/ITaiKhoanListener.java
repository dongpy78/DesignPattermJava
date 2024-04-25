package BaiTapTuLuyen.LuyenTap.Observer.atm;


// withdrawal: rut tien
// qualified: dat tieu chuan
public interface ITaiKhoanListener {
    public boolean kiemTraSoDu(float withdrawal);
    public void nhanThongBao(boolean qualified, float withdrawal);
}
