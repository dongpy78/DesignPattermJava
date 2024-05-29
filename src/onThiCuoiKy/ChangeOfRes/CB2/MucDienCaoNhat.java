package onThiCuoiKy.ChangeOfRes.CB2;

public class MucDienCaoNhat extends AbstractMucDien {

    public MucDienCaoNhat(int min, int max, int gia) {
        super(min, max, gia);
    }

    @Override
    public AbstractMucDien mucDienKeTiep(AbstractMucDien m) {
        return null;
    }

    @Override
    public int xuLy(int soKw) {
       return (soKw - min) * gia;
    }
}
