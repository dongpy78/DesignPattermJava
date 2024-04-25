package BaiTapTuLuyen.BaiTap.Builder;

public class Main {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien("Dong", "53133727", "Phu Hoa");

        MonHoc mh1 = new MonHoc("Toan", 3, "123123");
        MonHoc mh2 = new MonHoc("Toan", 3, "123123");

        KeHoachHocTap keHoachHocTap = new KeHoachHocTap.Builder().setSinhVien(sv1).setDsMonHoc(mh1).setDsMonHoc(mh2).build();

        System.out.println(keHoachHocTap.hienThi());


    }
}
