package baitap_05_06.changeOfRes;

public class MenhGia extends AbstractMenhGia{
    AbstractMenhGia ketiep;

    public MenhGia(int menhGia) {
        super(menhGia);
    }

    @Override
    public AbstractMenhGia menhGiaKeTiep(AbstractMenhGia m) {
        ketiep = m;
        return ketiep;
    }

    @Override
    public void xuLy(int soTien) {
        int soto = soTien / menhGia;
        int sodu = soTien % menhGia;
        if(soto > 0) System.out.println(soto + " mệnh giá: " + menhGia);
        if(sodu > 0) ketiep.xuLy(sodu);
    }
}
