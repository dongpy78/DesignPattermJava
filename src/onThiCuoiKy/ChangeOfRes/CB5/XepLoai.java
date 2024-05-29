package onThiCuoiKy.ChangeOfRes.CB5;

public class XepLoai extends AbstractXepLoai{
    AbstractXepLoai ketiep;

    public XepLoai(int diemXepLoai, String hocLuc) {
        super(diemXepLoai, hocLuc);
    }

    @Override
    public AbstractXepLoai xepLoaiKeTiep(AbstractXepLoai x) {
        ketiep = x;
        return ketiep;
    }

    @Override
    public void xuLy(int diemDatDuoc) {
        if(diemDatDuoc < diemXepLoai) System.out.println("Điểm của bạn: " + diemDatDuoc + " Xếp loại: " + hocLuc);
        else ketiep.xuLy(diemDatDuoc);
    }
}
