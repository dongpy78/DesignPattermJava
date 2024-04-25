package BaiTapTuLuyen.LuyenTap.Observer.atm;

public class TaiKhoan implements ITaiKhoanListener{
    private float soDu;

    public float getSoDu() {
        return soDu;
    }

    public void setSoDu(float soDu) {
        this.soDu = soDu;
    }

    public TaiKhoan(float soDu) {
        this.soDu = soDu;
    }

    public void login(ATM atm) {
        atm.login(this);
    }

    public void logout(ATM atm) {
        atm.logout(this);
    }

    @Override
    public boolean kiemTraSoDu(float withdrawal) {
        return soDu >= withdrawal;
    }

    @Override
    public void nhanThongBao(boolean qualified, float withdrawal) {
        String message;
        if(qualified) {
            soDu-=withdrawal;
            message = "Da Rut";
        } else {
            message = "So du khong du";
        }
        System.out.println(message);
    }
}
