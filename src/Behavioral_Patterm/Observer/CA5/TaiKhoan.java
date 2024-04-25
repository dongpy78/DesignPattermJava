package Behavioral_Patterm.Observer.CA5;

public class TaiKhoan implements ATM.TaiKhoanATM {
    String ten;
    int soDu;
    ATM atm;

    public TaiKhoan(String ten, int soDu, ATM atm) {
        this.ten = ten;
        this.soDu = soDu;
        this.atm = atm;
    }

    public void duaTheVaoATM() {
        atm.nhanThe(this);

    }

    public void rutTheKhoiATM() {
        atm.traThe(this);
    }

    @Override
    public boolean kiemTraSoDu(int soTien) {
        return soDu - soTien >= 50;
    }

    @Override
    public void nhanThongBao(int soTienRut, boolean thanhCong) {
        if(thanhCong) {
            System.out.println("Tai khoan: " + ten);
            System.out.println("So du ban dau: " + soDu);
            System.out.println("So tien rut: " + soTienRut);
            soDu = soDu - soTienRut;
            System.out.println("So du cuoi: " + soDu);
        } else {
            System.out.println("Tai khoan: " + ten);
            System.out.println("So du ban dau: " + soDu);
            System.out.println("So tien rut: " + soTienRut);
            System.out.println("Khong du tien de rut");

        }
    }
}
