package onThiCuoiKy.ChangeOfRes.CB1;

public class MenhGia extends AbstractMenhGiaATM{
    int menhGia;
    AbstractMenhGiaATM ketiep;

    public MenhGia(int menhGia) {
        this.menhGia = menhGia;
    }

    @Override
    AbstractMenhGiaATM menhGiaKeTiep(AbstractMenhGiaATM m) {
        ketiep = m;
        return ketiep;
    }

    @Override
    void xuLy(int soTien) {
        int soto = soTien / menhGia;
        int sodu = soTien % menhGia;
        if(soto > 0) System.out.println(soto + " to menh gia: " + menhGia);
        if(sodu > 0) ketiep.xuLy(sodu);
    }
}
