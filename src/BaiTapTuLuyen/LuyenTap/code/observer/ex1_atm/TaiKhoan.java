package BaiTapTuLuyen.LuyenTap.code.observer.ex1_atm;

public class TaiKhoan implements IListennerATM {
    int soDu;

    public void login(ATM atm) {
        atm.login(this);
    }

    public void logout(ATM atm) {
        atm.login(this);
    }

    public TaiKhoan(int soDu) {
        this.soDu = soDu;
    }

    public int getSoDu() {
        return soDu;
    }

    public void setSoDu(int soDu) {
        this.soDu = soDu;
    }

    @Override
    public boolean kiemTraSoDu(int withdrawal) {
        return soDu - 50 >= withdrawal;
    }

    @Override
    public void nhanThongBao(boolean qualified, int withdrawal) {
        String message;
        if(qualified) {
            soDu -= withdrawal;
            message = "Bạn đã rút tiền thành công: " + withdrawal + "VNĐ";
        } else {
            message = "Số dư trong tài khoản của bạn không đủ!";
        }
        System.out.println(message);
    }
}
