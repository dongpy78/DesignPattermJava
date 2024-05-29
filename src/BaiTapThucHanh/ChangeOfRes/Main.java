package BaiTapThucHanh.ChangeOfRes;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Chào mừng đến với xổ số tuy hòa: ");
        GiaiThuong g8 = new GiaiUt("Giải 8", new ArrayList<>(Arrays.asList("66")));
        GiaiThuong g7 = new GiaiThuongThuong("Giải 7", new ArrayList<>(Arrays.asList("810")));
        GiaiThuong g6 = new GiaiThuongThuong("Giải 6", new ArrayList<>(Arrays.asList("4971", "1751", "9984", "3819")));
        GiaiThuong g5 = new GiaiThuongThuong("Giải 5", new ArrayList<>(Arrays.asList("7656")));
        GiaiThuong g4 = new GiaiThuongThuong("Giải 4", new ArrayList<>(Arrays.asList("09873", "09243", "00773", "07673", "87873", "00173")));
        GiaiThuong g3 = new GiaiThuongThuong("Giải 3", new ArrayList<>(Arrays.asList("88888", "99999")));
        GiaiThuong g2 = new GiaiThuongThuong("Giải 2", new ArrayList<>(Arrays.asList("292929")));
        GiaiThuong g1 = new GiaiThuongThuong("Giải 1", new ArrayList<>(Arrays.asList("030303")));
        GiaiThuong giaikk = new GiaiKK("Giải khuyến khích: ", new ArrayList<>(Arrays.asList("313131")));
        GiaiThuong gdb = new GiaiThuongThuong("Giải đặt biệt", new ArrayList<>(Arrays.asList("313131")));
        gdb.giaiThuongKeTiep(giaikk).giaiThuongKeTiep(g1).giaiThuongKeTiep(g2).giaiThuongKeTiep(g3).giaiThuongKeTiep(g4).giaiThuongKeTiep(g5).giaiThuongKeTiep(g6).giaiThuongKeTiep(g7).giaiThuongKeTiep(g8);
        System.out.println(gdb.doVeSo("313132"));
    }
}
