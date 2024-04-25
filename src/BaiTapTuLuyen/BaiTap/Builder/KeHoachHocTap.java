package BaiTapTuLuyen.BaiTap.Builder;



import java.util.ArrayList;
import java.util.List;

public class KeHoachHocTap {
    SinhVien sinhVien;
    List<MonHoc> monHocs = new ArrayList<>();

    public KeHoachHocTap(Builder builder) {
        this.sinhVien = builder.sinhVien;
        this.monHocs = builder.dsMonHoc;
    }

    public static class Builder {
        SinhVien sinhVien;
        List<MonHoc> dsMonHoc = new ArrayList<>();

        public Builder setSinhVien(SinhVien sinhVien) {
            this.sinhVien = sinhVien;
            return this;
        }

        public Builder setDsMonHoc(MonHoc dsMonHoc) {
            this.dsMonHoc.add(dsMonHoc);
            return this;
        }

        public KeHoachHocTap build() {
            return new KeHoachHocTap(this);
        }


    }
    public String hienThi() {
        String s = sinhVien.toString();
        for(int i = 0; i < monHocs.size(); i++) {
            s += "\n" + monHocs.get(i).toString();
        }
        return s;
    }
}
