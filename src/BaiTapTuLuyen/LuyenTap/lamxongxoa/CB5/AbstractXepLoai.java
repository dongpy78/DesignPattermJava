package BaiTapTuLuyen.LuyenTap.lamxongxoa.CB5;


public abstract class AbstractXepLoai {
    int mucDiem;
    String xepLoai;

    public AbstractXepLoai(int mucDiem, String xepLoai) {
        this.mucDiem = mucDiem;
        this.xepLoai = xepLoai;
    }

    public abstract AbstractXepLoai xepLoaiKeTiep(AbstractXepLoai x);
    public abstract void xuLy(int diemDatDuoc);
}
