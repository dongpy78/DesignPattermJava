package BaiTapTuLuyen.LuyenTap.lamxongxoa.CB5;

public class XepLoaiCaoNhat extends AbstractXepLoai{
    public XepLoaiCaoNhat(int mucDiem, String xepLoai) {
        super(mucDiem, xepLoai);
    }

    @Override
    public AbstractXepLoai xepLoaiKeTiep(AbstractXepLoai x) {
        return null;
    }

    @Override
    public void xuLy(int diemDatDuoc) {
        if(diemDatDuoc <= mucDiem) System.out.println("Điểm của bạn: " + diemDatDuoc + " --> Xếp loại: " + xepLoai);
    }
}
