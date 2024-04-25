package BaiTapTuLuyen.LuyenTap.test;

public class Main {
    public static void main(String[] args) {
        ThongTinSach thongTinSach = new ThongTinSach("Mau thiet ke", 400, "Van Dong");
        DanhSachChuong chuong1 = new DanhSachChuong("Chuong 1 cccccccccccccccccccccccccccccccc");
        DanhSachChuong chuong2 = new DanhSachChuong("Chuong 2ccccccccccccccccccccccccccccccccccccc");

        SachBuilder sachBuilder = new SachBuilder.Builder().addThongTinSach(thongTinSach).addDanhSachChuongs(chuong1).addDanhSachChuongs(chuong2).build();

        System.out.println(sachBuilder.hienThi());
    }
}
