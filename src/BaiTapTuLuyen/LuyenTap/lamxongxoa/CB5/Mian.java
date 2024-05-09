package BaiTapTuLuyen.LuyenTap.lamxongxoa.CB5;

public class Mian {
    public static void main(String[] args) {
        AbstractXepLoai x1 = new XepLoai(5, "Yếu!");
        AbstractXepLoai x2 = new XepLoai(7, "Trung bình!");
        AbstractXepLoai x3 = new XepLoai(8, "Khá!");
        AbstractXepLoai x4 = new XepLoai(9, "Giỏi!");
        AbstractXepLoai x5 = new XepLoaiCaoNhat(10, "Xuất Sắc!");
        x1.xepLoaiKeTiep(x2).xepLoaiKeTiep(x3).xepLoaiKeTiep(x4).xepLoaiKeTiep(x5);
        x1.xuLy(-1);
    }
}



