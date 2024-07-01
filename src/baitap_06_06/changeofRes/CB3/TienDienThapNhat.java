package baitap_06_06.changeofRes.CB3;

public class TienDienThapNhat extends AbstractTinhTienDien{
    public TienDienThapNhat(int min, int max, int gia) {
        super(min, max, gia);
    }

    @Override
    public AbstractTinhTienDien tienDienKeTiep(AbstractTinhTienDien t) {
        return null;
    }

    @Override
    public int xuLy(int sokw) {
        return 0;
    }
}
