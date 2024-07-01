package baitap_06_06.observer.atm;

public class TaiKhoan implements IListenerATM{
    int sodu;
    public void login(ATM atm) {
        atm.login(this);
    }
    public void logout(ATM atm) {
        atm.logout(this);
    }

    public TaiKhoan(int sodu) {
        this.sodu = sodu;
    }

    public int getSodu() {
        return sodu;
    }

    public void setSodu(int sodu) {
        this.sodu = sodu;
    }

    @Override
    public boolean kiemTraSoDu(int withdrawal) {
        return sodu - 50 >= withdrawal;
    }

    @Override
    public void nhanThongBao(boolean qualified, int withdrawal) {
        String message;
        if(qualified) {
            sodu -= withdrawal;
            message = "Ban da rut tien thanh cong!" + withdrawal + "VND";
        } else {
            message = "So du trong tai khoan cua ban khong du!";
        }
        System.out.println(message);
    }
}
