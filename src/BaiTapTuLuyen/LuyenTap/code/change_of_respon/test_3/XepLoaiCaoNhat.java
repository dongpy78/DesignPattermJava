package BaiTapTuLuyen.LuyenTap.code.change_of_respon.test_3;

public class XepLoaiCaoNhat extends AbstractXepLoai{
    public XepLoaiCaoNhat(int muc_diem, String xep_loai) {
        super(muc_diem, xep_loai);
    }

    @Override
    public AbstractXepLoai xepLoaiKeTiep(AbstractXepLoai x) {
        return null;
    }

    @Override
    public void xuLy(int diem_dat_duoc) {
        if(diem_dat_duoc <= muc_diem) System.out.println("Điểm của bạn: " + diem_dat_duoc + " --> Xếp loại: " + xep_loai);
    }
}
