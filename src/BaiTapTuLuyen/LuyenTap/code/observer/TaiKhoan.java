package BaiTapTuLuyen.LuyenTap.code.observer;

public class TaiKhoan implements ITaiKhoanListener{
    float soDu;

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
    public boolean kiemTraSoDu(float tien_rut) {
        return soDu >= tien_rut;
    }

    @Override
    public void nhanThongBao(boolean tieu_chuan, float tien_rut) {
        String message;
        if(tieu_chuan) {
            soDu -= tien_rut;
            message = "Da rut tien!";
        } else {
            message = "So du trong tai khoan cua ban khong du";
        }
        System.out.println(message);
    }
}
