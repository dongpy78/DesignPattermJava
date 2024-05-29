package onThiCuoiKy.ChangeOfRes.CB2;

public class MucDien extends AbstractMucDien {
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
    public int xuLy(int soKw) {
        if(soKw <= max) return (soKw - min) * gia;
        else return (max - min) * gia + ketiep.xuLy(soKw);
    }
}
