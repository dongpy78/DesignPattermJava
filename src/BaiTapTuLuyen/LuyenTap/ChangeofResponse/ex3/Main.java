package BaiTapTuLuyen.LuyenTap.ChangeofResponse.ex3;

public class Main {
    public static void main(String[] args) {
        AbstractXepLoai x1 = new XepLoai(0, 5, "Yeu!");
        AbstractXepLoai x2 = new XepLoai(5, 7, "Trung binh!");
        AbstractXepLoai x3 = new XepLoai(7, 8, "Kha!");
        AbstractXepLoai x4 = new XepLoai(8, 9, "Gioi!");
        AbstractXepLoai x5 = new XepLoai(9, 10, "Xuat sac!");
        x1.xepLoaiKeTiep(x2).xepLoaiKeTiep(x3).xepLoaiKeTiep(x4).xepLoaiKeTiep(x5);
        x1.xuLy(9);
    }
}
