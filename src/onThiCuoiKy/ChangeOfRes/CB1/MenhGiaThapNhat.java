package onThiCuoiKy.ChangeOfRes.CB1;

public class MenhGiaThapNhat extends AbstractMenhGiaATM{
    int menhGia;

    public MenhGiaThapNhat(int menhGia) {
        this.menhGia = menhGia;
    }

    @Override
    AbstractMenhGiaATM menhGiaKeTiep(AbstractMenhGiaATM m) {
        return null;
    }

    @Override
    void xuLy(int soTien) {
        int soto = soTien/menhGia;
        if(soto > 0) System.out.println(soto + " to menh gia: " + menhGia);
    }
}
