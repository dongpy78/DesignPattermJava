package BaiTapTuLuyen.LuyenTap.code.change_of_respon.test_1;

public class MenhGia extends AbstractMenhGiaATM{
    AbstractMenhGiaATM ketiep;
    public MenhGia(int menhGia) {
        super(menhGia);
    }

    @Override
    public AbstractMenhGiaATM menhGiaKeTiep(AbstractMenhGiaATM m) {
        ketiep = m;
        return ketiep;
    }

    @Override
    public void xuLy(int soTien) {
        int soto = soTien / menhGia;
        int sodu = soTien % menhGia;
        if(soto > 0) System.out.println(soto + " tờ mệnh giá " + menhGia);
        if(sodu > 0) ketiep.xuLy(sodu);
    }
}
