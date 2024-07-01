package baitap_06_06.changeofRes.CB3;

public class TienDien extends AbstractTinhTienDien {
    AbstractTinhTienDien ketiep;

    public TienDien(int min, int max, int gia) {
        super(min, max, gia);
    }

    @Override
    public AbstractTinhTienDien tienDienKeTiep(AbstractTinhTienDien t) {
        ketiep = t;
        return ketiep;
    }

    @Override
    public int xuLy(int sokw) {
        if(sokw <= max) return (sokw - min) * gia;
        else return (max - min) * gia + ketiep.xuLy(sokw);

    }
}
