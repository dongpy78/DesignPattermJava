package BaiTapTuLuyen.LuyenTap.test2;



public class Main {
    public static void main(String[] args) {
        ThongTinSach thongTinSach = new ThongTinSach("Mau thiet ke", 400, "DOng");
        DanhSachChuong chuong1 = new DanhSachChuong("Chuong 1");
        DanhSachChuong chuong2 = new DanhSachChuong("Chuong 2");

        SachBuilder sachBuilder = new SachBuilder.Builder().setThongTinSach(thongTinSach).setDs_chuong(chuong1).setDs_chuong(chuong2).build();

        System.out.println(sachBuilder.hienThi());
    }
}
