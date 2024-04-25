package Behavioral_Patterm.ChangeOfResponsibility.CB3;

public class BacCaoNhat extends TienDienBacThang{
    public BacCaoNhat(String tenbac, int min, int max, int gia) {
        super(tenbac, min, max, gia);
    }

    @Override
    public TienDienBacThang tienTienMucTiepTheo(TienDienBacThang m) {
        return m;
    }

    @Override
    public int tinhTienDien(int soKw) {
        return (soKw - min) * gia;
    }
}
