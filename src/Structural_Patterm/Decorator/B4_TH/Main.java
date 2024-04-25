package Structural_Patterm.Decorator.B4_TH;

public class Main {
    public static void main(String[] args) {
        KeHoachHocTap kh1 = new MonHoc("Mẫu thiết kế", 3, 20000);
        KeHoachHocTap kh2 = new MonHoc("Lập trình di động", 4, 30000);
        KeHoachHocTap kh3 = new MonHoc("Tin học đại cương", 3, 20000);
        KeHoachHocTap kh4 = new MonHoc("Cơ sở dữ liệu", 3, 20000);
        KeHoachHocTap nam1 = new KeHoachChung("Môn Học Năm 1");
        KeHoachHocTap nam2 = new KeHoachChung("Môn Học Năm 2");
        KeHoachHocTap khc1 = new KeHoachChung("Kế Hoạch Học Tập");
        KeHoachHocTap root = new KeHoachChung("Main");

        nam1.addKeHoachHocTap(kh1);
        nam1.addKeHoachHocTap(kh2);

        nam2.addKeHoachHocTap(kh3);
        nam2.addKeHoachHocTap(kh4);

        khc1.addKeHoachHocTap(nam1);
        khc1.addKeHoachHocTap(nam2);

        root.addKeHoachHocTap(khc1);

        // Chỉ cần gọi duongDan một lần cho đối tượng gốc (root)
        System.out.println(root.duongDan(" "));

    }
}
