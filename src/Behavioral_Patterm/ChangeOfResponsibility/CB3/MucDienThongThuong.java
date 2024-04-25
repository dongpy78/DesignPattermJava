package Behavioral_Patterm.ChangeOfResponsibility.CB3;

public class MucDienThongThuong extends TienDienBacThang {
    TienDienBacThang ketiep;

    public MucDienThongThuong(String tenbac, int min, int max, int gia, TienDienBacThang ketiep) {
        super(tenbac, min, max, gia);
        this.ketiep = ketiep;
    }

    public MucDienThongThuong(String tenbac, int min, int max, int gia) {
        super(tenbac, min, max, gia);
    }

    @Override
    public TienDienBacThang tienTienMucTiepTheo(TienDienBacThang k) {
        ketiep = k;
        return ketiep;
    }

    @Override
    public int tinhTienDien(int soKw) {
        if(soKw <= max)
            return (soKw - min)*gia;
        else return (max - min) * gia + ketiep.tinhTienDien(soKw);
    }
}
