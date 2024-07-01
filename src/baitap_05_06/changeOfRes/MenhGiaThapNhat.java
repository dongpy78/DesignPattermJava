package baitap_05_06.changeOfRes;

public class MenhGiaThapNhat extends AbstractMenhGia {
    AbstractMenhGia ketiep;

    public MenhGiaThapNhat(int menhGia) {
        super(menhGia);
    }

    @Override
    public AbstractMenhGia menhGiaKeTiep(AbstractMenhGia m) {
        return null;
    }

    @Override
    public void xuLy(int soTien) {

    }
}
