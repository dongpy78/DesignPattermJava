package BaiTapTuLuyen.LuyenTap.code.change_of_respon.test_1;

public class MenhGiaThapNhat extends AbstractMenhGiaATM{
    public MenhGiaThapNhat(int menhGia) {
        super(menhGia);
    }

    @Override
    public AbstractMenhGiaATM menhGiaKeTiep(AbstractMenhGiaATM m) {
        return null;
    }

    @Override
    public void xuLy(int soTien) {
        int soto = soTien / menhGia;
        if(soto > 0) System.out.println(soto + " tờ mệnh giá " + menhGia);
    }
}
