package BaiTapTuLuyen.LuyenTap.code.change_of_respon.test_3;

public abstract class AbstractXepLoai {
    int muc_diem;
    String xep_loai;

    public AbstractXepLoai(int muc_diem, String xep_loai) {
        this.muc_diem = muc_diem;
        this.xep_loai = xep_loai;
    }

    public int getMuc_diem() {
        return muc_diem;
    }

    public void setMuc_diem(int muc_diem) {
        this.muc_diem = muc_diem;
    }

    public String getXep_loai() {
        return xep_loai;
    }

    public void setXep_loai(String xep_loai) {
        this.xep_loai = xep_loai;
    }

    public abstract AbstractXepLoai xepLoaiKeTiep(AbstractXepLoai x);
    public abstract void xuLy(int diem_dat_duoc);

}
