package BaiTapTuLuyen.LuyenTap.lamxongxoa.CB5;

public class XepLoai extends AbstractXepLoai{
    AbstractXepLoai ketiep;
    public XepLoai(int mucDiem, String xepLoai) {
        super(mucDiem, xepLoai);
    }

    @Override
    public AbstractXepLoai xepLoaiKeTiep(AbstractXepLoai x) {
        ketiep = x;
        return ketiep;
    }

    @Override
    public void xuLy(int diemDatDuoc) {
        if(diemDatDuoc < 0) System.out.println("Điểm nhập vao không hợp lệ!");
        else if(diemDatDuoc < mucDiem) System.out.println("Điểm của bạn: " + diemDatDuoc + " --> Xếp loại: " + xepLoai);
        else ketiep.xuLy(diemDatDuoc);
    }
}
