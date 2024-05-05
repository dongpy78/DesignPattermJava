package BaiTapTuLuyen.LuyenTap.code.change_of_respon.test_3;

public class XepLoai extends AbstractXepLoai{
    AbstractXepLoai ketiep;
    public XepLoai(int muc_diem, String xep_loai) {
        super(muc_diem, xep_loai);
    }

    @Override
    public AbstractXepLoai xepLoaiKeTiep(AbstractXepLoai x) {
        ketiep = x;
        return ketiep;
    }

    @Override
    public void xuLy(int diem_dat_duoc) {
        if(diem_dat_duoc < 0) System.out.println("Điểm không hợp lệ!");
        else if(diem_dat_duoc < muc_diem) System.out.println("Điểm của bạn: " + diem_dat_duoc + " --> Xếp loại: " + xep_loai);
        else ketiep.xuLy(diem_dat_duoc);
    }
}
