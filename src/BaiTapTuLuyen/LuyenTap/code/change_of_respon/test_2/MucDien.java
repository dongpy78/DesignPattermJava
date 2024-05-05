package BaiTapTuLuyen.LuyenTap.code.change_of_respon.test_2;

public class MucDien extends AbstractMucDien{
    AbstractMucDien ketiep;
    public MucDien(int min, int max, int gia) {
        super(min, max, gia);
    }

    @Override
    public AbstractMucDien mucDienKeTiep(AbstractMucDien m) {
        ketiep = m;
        return ketiep;
    }

    @Override
    public int xuLy(int sokw) {
        if(sokw <= max) return (sokw - min) * gia;
        else return (max - min) * gia + ketiep.xuLy(sokw);
    }
}
