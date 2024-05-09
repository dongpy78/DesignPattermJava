package BaiTapTuLuyen.LuyenTap.lamxongxoa.CB3;

public class MucDienCaoNhat extends Abstract_MucDien{
    public MucDienCaoNhat(String bac, int min, int max, int mucGia) {
        super(bac, min, max, mucGia);
    }

    @Override
    public Abstract_MucDien mucDienKeTiep(Abstract_MucDien m) {
        return null;
    }

    @Override
    public int xuLy(int soKw) {
       return (soKw - min) * mucGia;
    }
}
