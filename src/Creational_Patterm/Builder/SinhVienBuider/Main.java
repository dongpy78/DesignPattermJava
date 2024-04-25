package Creational_Patterm.Builder.SinhVienBuider;

public class Main {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien("Dong", "123", "Phu Yen");
        MonHoc monHoc = new MonHoc("Toan", 3, "Toan1");
        MonHoc monHoc2 = new MonHoc("Tieng Viet", 3, "123");

        KeHoachKyHoc keHoachKyHoc = new KeHoachKyHoc.Builder().setSinhVien(sv1).setDsMonHoc(monHoc).setDsMonHoc(monHoc2).build();

        System.out.println(keHoachKyHoc.toString());

    }
}
