package onThiCuoiKy.ChangeOfRes.CB5;

public class Main {
    public static void main(String[] args) {
        AbstractXepLoai x1 = new XepLoai(5, "Yếu");
        AbstractXepLoai x2 = new XepLoai(7, "Trung Bình");
        AbstractXepLoai x3 = new XepLoai(8, "Khá");
        AbstractXepLoai x4 = new XepLoai(9, "Giỏi");
        AbstractXepLoai x5 = new XepLoaiCaoNhat(10, "Xuất Sắc");
        x1.xepLoaiKeTiep(x2).xepLoaiKeTiep(x3).xepLoaiKeTiep(x4).xepLoaiKeTiep(x5);
        x1.xuLy(8);
    }
}
