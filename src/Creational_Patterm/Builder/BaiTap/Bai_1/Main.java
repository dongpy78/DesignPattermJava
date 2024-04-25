package Creational_Patterm.Builder.BaiTap.Bai_1;

public class Main {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien("Bùi Văn Đồng", "63133727", "Phu Yen");
        MonHoc mh1 = new MonHoc("Mau thiet ke", 3, "MTK1");
        MonHoc mh2 = new MonHoc("Lap trinh di dong", 3, "MTK1");

        KeHoachHocTap keHoachHocTap = new KeHoachHocTap.Builder().setSinhVien(sv1).setDs_MonHoc(mh1).setDs_MonHoc(mh2).build();

        System.out.println(keHoachHocTap.hienThi());
    }

}
