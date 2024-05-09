package BaiTapTuLuyen.LuyenTap.lamxongxoa.CB1;

public class MenhGiaThapNhat extends Abstract_MenhGiaATM{
    public MenhGiaThapNhat(int menhGia) {
        super(menhGia);
    }

    @Override
    public Abstract_MenhGiaATM menhGiaKeTiep(Abstract_MenhGiaATM m) {
        return null;
    }

    @Override
    public void xuLy(int soTien) {
        int soto = soTien / menhGia;
        System.out.println(soto + " tờ mệnh giá: " + menhGia);
    }
}
