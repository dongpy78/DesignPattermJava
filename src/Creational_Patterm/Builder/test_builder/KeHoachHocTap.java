package Creational_Patterm.Builder.test_builder;
import java.util.ArrayList;
import java.util.List;

public class KeHoachHocTap {
    SinhVien sinhVien;
    List<MonHoc> monHocs;

    public KeHoachHocTap(Builder builder) {
        this.sinhVien = builder.sinhVien;
        this.monHocs = builder.ds_MonHoc;
    }

//    @Override
//    public String toString() {
//        StringBuilder builder = new StringBuilder();
//        int i = 1;
//
//        builder.append(sinhVien.toString()).append("\n");
//        for(var c: monHocs) {
//            builder.append("Môn học " + i++ + ":").append(c.toString()).append("\n");
//        }
//        return builder.toString();
//    }

    public String hienThi() {
        String s = sinhVien.toString();
        for(int i = 0; i < monHocs.size(); i++) {
            s += "\n" + monHocs.get(i).toString();
        }
        return s;
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
}
