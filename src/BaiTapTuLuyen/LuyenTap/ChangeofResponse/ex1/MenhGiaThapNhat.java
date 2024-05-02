package BaiTapTuLuyen.LuyenTap.ChangeofResponse.ex1;

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
        if(soto > 0) System.out.println(soto + " to menh gia " + menhGia);
    }
}
