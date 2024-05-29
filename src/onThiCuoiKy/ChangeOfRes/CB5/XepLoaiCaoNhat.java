package onThiCuoiKy.ChangeOfRes.CB5;

public class XepLoaiCaoNhat extends AbstractXepLoai {

    public XepLoaiCaoNhat(int diemXepLoai, String hocLuc) {
        super(diemXepLoai, hocLuc);
    }

    @Override
    public AbstractXepLoai xepLoaiKeTiep(AbstractXepLoai x) {
        return null;
    }

    @Override
    public void xuLy(int diemDatDuoc) {
        if(diemDatDuoc <= diemXepLoai) System.out.println("Điểm của bạn: " + diemDatDuoc + " Xếp loại: " + hocLuc);
    }
}
