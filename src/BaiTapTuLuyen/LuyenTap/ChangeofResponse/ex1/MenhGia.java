package BaiTapTuLuyen.LuyenTap.ChangeofResponse.ex1;

public class MenhGia extends Abstract_MenhGiaATM{
    Abstract_MenhGiaATM ketiep;
    public MenhGia(int menhGia) {
        super(menhGia);
    }

    @Override
    public Abstract_MenhGiaATM menhGiaKeTiep(Abstract_MenhGiaATM m) {
        ketiep = m;
        return ketiep;
    }

    @Override
    public void xuLy(int soTien) {
        int soto = soTien / menhGia;
        int sodu = soTien % menhGia;
        if(soto > 0) System.out.println(soto + " to menh gia " + menhGia);
        if(sodu > 0) ketiep.xuLy(sodu);

    }
}
