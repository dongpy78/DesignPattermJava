package BaiTapTuLuyen.LuyenTap.lamxongxoa.CB3;

import BaiTapTuLuyen.LuyenTap.code.change_of_respon.test_2.AbstractMucDien;

public abstract class Abstract_MucDien {
    String bac;
    int min, max, mucGia;

    public Abstract_MucDien(String bac, int min, int max, int mucGia) {
        this.bac = bac;
        this.min = min;
        this.max = max;
        this.mucGia = mucGia;
    }

    public abstract Abstract_MucDien mucDienKeTiep(Abstract_MucDien m);
    public abstract int xuLy(int soKw);
}
