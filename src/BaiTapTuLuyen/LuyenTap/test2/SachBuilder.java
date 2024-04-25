package BaiTapTuLuyen.LuyenTap.test2;



import java.util.ArrayList;
import java.util.List;

public class SachBuilder {
    ThongTinSach thongTinSach;
    List<DanhSachChuong> chuongs = new ArrayList<>();

    public SachBuilder(Builder builder) {
        this.thongTinSach =builder.thongTinSach;
        this.chuongs = builder.ds_chuong;
    }

    public static class Builder {
        ThongTinSach thongTinSach;
        List<DanhSachChuong> ds_chuong = new ArrayList<>();

        public Builder setThongTinSach(ThongTinSach thongTinSach) {
            this.thongTinSach = thongTinSach;
            return this;
        }

        public Builder setDs_chuong(DanhSachChuong ds_chuong) {
            this.ds_chuong.add(ds_chuong);
            return this;
        }

        public SachBuilder build() {
            return new SachBuilder(this);
        }
    }

    @Override
    public String toString() {
        return "SachBuilder{" +
                "thongTinSach=" + thongTinSach +
                ", chuongs=" + chuongs +
                '}';
    }

   public String hienThi() {
        String s = thongTinSach.toString();
        for(int i = 0; i < chuongs.size(); i++) {
            s += "\n" + chuongs.get(i).toString();
        }
        return s;
   }

}
