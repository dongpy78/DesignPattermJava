package Creational_Patterm.Builder.BaiTap.Bai_1;

import java.util.ArrayList;
import java.util.List;

public class KeHoachHocTap {
    SinhVien sinhVien;
    List<MonHoc> monHocs = new ArrayList<>();

    public KeHoachHocTap(Builder builder) {
        this.sinhVien = builder.sinhVien;
        this.monHocs = builder.ds_MonHoc;
    }

    public static class Builder {
        SinhVien sinhVien;
        List<MonHoc> ds_MonHoc = new ArrayList<>();

        public Builder setSinhVien(SinhVien sinhVien) {
            this.sinhVien = sinhVien;
            return this;
        }

        public Builder setDs_MonHoc(MonHoc ds_MonHoc) {
            this.ds_MonHoc.add(ds_MonHoc);
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
