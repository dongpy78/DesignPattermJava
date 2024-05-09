package BaiTapTuLuyen.LuyenTap.lamxongxoa.CB1;

public class MenhGia extends Abstract_MenhGiaATM{
    Abstract_MenhGiaATM keTiep;

    public MenhGia(int menhGia) {
        super(menhGia);
    }

    @Override
    public Abstract_MenhGiaATM menhGiaKeTiep(Abstract_MenhGiaATM m) {
        keTiep = m;
        return keTiep;
    }

    @Override
    public void xuLy(int soTien) {
        int soto = soTien / menhGia;
        int sodu = soTien % menhGia;
        if(soto > 0) System.out.println(soto + " tờ mệnh giá: " + menhGia);
        if(sodu > 0) keTiep.xuLy(sodu);
    }
}
