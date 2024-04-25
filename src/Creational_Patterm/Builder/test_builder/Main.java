package Creational_Patterm.Builder.test_builder;

public class Main {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien("Bui Van Dong", "63133727", "Phu Yen");
        SinhVien sv2 = new SinhVien("Bui Kim Nhan", "6512345", "Phu Yen");
        MonHoc mh1 = new MonHoc("Tin hoc dai cuong", 3, "TH01");
        MonHoc mh2 = new MonHoc("Lap trinh di dong", 3, "TH01");
        MonHoc mh3 = new MonHoc("Ky thuat lap trinh", 3, "TH01");
        MonHoc mh4 = new MonHoc("Toan roi rac", 3, "TH01");

        KeHoachHocTap keHoachHocTap1 = new KeHoachHocTap.Builder().setSinhVien(sv1).setDs_MonHoc(mh2).setDs_MonHoc(mh3).build();

        KeHoachHocTap keHoachHocTap2 = new KeHoachHocTap.Builder().setSinhVien(sv2).setDs_MonHoc(mh1).setDs_MonHoc(mh2).build();

        System.out.println(keHoachHocTap1.hienThi());
        System.out.println(keHoachHocTap2.hienThi());
    }
}
