package onThiCuoiKy.ChangeOfRes.CB5;

public abstract class AbstractXepLoai {
    int diemXepLoai;
    String hocLuc;

    public AbstractXepLoai(int diemXepLoai, String hocLuc) {
        this.diemXepLoai = diemXepLoai;
        this.hocLuc = hocLuc;
    }

    public abstract AbstractXepLoai xepLoaiKeTiep(AbstractXepLoai x);
    public abstract void xuLy(int diemDatDuoc);
}
