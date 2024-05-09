package BaiTapTuLuyen.LuyenTap.BaiTapLamThem.observer;

public class TaiKhoan implements IListennerATM{
    int soDu;

    public TaiKhoan(int soDu) {
        this.soDu = soDu;
    }

    public void login(ATM atm) {
        atm.login(this);
    }

    public void logout(ATM atm) {
        atm.logout(this);
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
        if (kiemTraSoDu(withdrawal)) {
            soDu -= withdrawal;
            message = "Bạn đã rút tiền thành công!" + " Số dư còn lại của bạn: " + getSoDu();
        } else {
            message = "Số dư của bạn không đủ. Vui lòng kiểm tra lại!";
        }
        System.out.println(message);
    }
}
