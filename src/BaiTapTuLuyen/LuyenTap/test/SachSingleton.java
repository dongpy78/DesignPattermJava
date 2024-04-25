package BaiTapTuLuyen.LuyenTap.test;

public class SachSingleton {
    private static SachBuilder sachBuilder;

    public static SachBuilder create() {
        if(sachBuilder == null) {
            ThongTinSach thongTinSach = new ThongTinSach("Mau thiet ke", 200, "Huynh Tuan Anh");
            DanhSachChuong chuong1 = new DanhSachChuong("Nhom mau khoi tao");
            DanhSachChuong chuong2 = new DanhSachChuong("Nhom mau hanh vi");
            DanhSachChuong chuong3 = new DanhSachChuong("Nhom mau cau truc");

            SachBuilder sachBuilder = new SachBuilder.Builder().addThongTinSach(thongTinSach).addDanhSachChuongs(chuong1).addDanhSachChuongs(chuong2).addDanhSachChuongs(chuong3).build();
        }
        return sachBuilder;
    }
}
