package Creational_Patterm.Builder.SinhVienBuider;

import java.util.ArrayList;
import java.util.List;

public class KeHoachKyHoc {
    SinhVien sinhVien;
    List<MonHoc> monHoc = new ArrayList<>();



    public KeHoachKyHoc(Builder builder) {
        this.sinhVien = builder.sinhVien;
        this.monHoc = builder.dsMonHoc;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(sinhVien.toString());
        for(var c : monHoc) {
            builder.append(c.toString());
        }
        return builder.toString();
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

        public KeHoachKyHoc build() {
            return new KeHoachKyHoc(this);
        }
    }

}
