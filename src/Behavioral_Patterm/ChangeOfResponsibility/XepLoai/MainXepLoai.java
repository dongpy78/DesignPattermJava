package Behavioral_Patterm.ChangeOfResponsibility.XepLoai;

public class MainXepLoai {
    public static void main(String[] args) {
        AbstractXepLoai x1 = new XepLoaiThongThuong(5, "Yeu");
        AbstractXepLoai x2 = new XepLoaiThongThuong(7, "Trung Binh");
        AbstractXepLoai x3 = new XepLoaiThongThuong(8, "Kha");
        AbstractXepLoai x4 = new XepLoaiThongThuong(9, "Gioi");
        AbstractXepLoai x5 = new XepLoaiCaoNhat(10, "Xuat Xac");

        // Establishing the chain
        x1.xepLoaiMucTiepTheo(x2);
        x2.xepLoaiMucTiepTheo(x3);
        x3.xepLoaiMucTiepTheo(x4);
        x4.xepLoaiMucTiepTheo(x5);

        // Start the chain
        x1.xeploai(4); // Example score
    }
}
