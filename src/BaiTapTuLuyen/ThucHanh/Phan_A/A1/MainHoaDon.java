package BaiTapTuLuyen.ThucHanh.Phan_A.A1;

public class MainHoaDon {
    public static void main(String[] args) {
        HoaDon hoaDon = new HoaDon.Builder().setHoaDonHeader("HD01", "31/03/2024", "Bui Van Dong").setDs_cthd("Dien Thoai", 10, 10000, 0.9).build();
        System.out.println(hoaDon.toString());
    }
}
