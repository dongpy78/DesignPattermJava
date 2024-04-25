package BaiTapTuLuyen.LuyenTap.test;

import java.util.ArrayList;
import java.util.List;

public class SachBuilder {
    ThongTinSach thongTinSach;
    List<DanhSachChuong> chuong = new ArrayList<>();

    public SachBuilder(Builder builder) {
        this.thongTinSach = builder.thongTinSach;
        this.chuong = builder.danhSachChuongs;
    }

    public static class Builder {
        ThongTinSach thongTinSach;
        List<DanhSachChuong> danhSachChuongs = new ArrayList<>();

        public Builder addThongTinSach(ThongTinSach thongTinSach) {
            this.thongTinSach = thongTinSach;
            return this;
        }

        public Builder addDanhSachChuongs(DanhSachChuong chuong) {
            this.danhSachChuongs.add(chuong);
            return this;
        }

        public SachBuilder build() {
            return new SachBuilder(this);
        }
    }

    public String hienThi() {
        String s = thongTinSach.toString();
        for(int i = 0; i < chuong.size(); i++) {
            s += "\n" + chuong.get(i).toString();
        }
        return s;
    }

}
