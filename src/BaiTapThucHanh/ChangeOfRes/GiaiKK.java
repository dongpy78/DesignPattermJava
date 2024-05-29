package BaiTapThucHanh.ChangeOfRes;

import java.util.List;

public class GiaiKK extends GiaiThuong{
    GiaiThuong ketiep;
    String tenGiaiThuong;
    List<String> soTrungThuongs;
    String sub;
    public GiaiKK(String tenGiaiThuong, List<String> soTrungThuongs) {
        this.tenGiaiThuong = tenGiaiThuong;
        this.soTrungThuongs = soTrungThuongs;
    }

    @Override
    public GiaiThuong giaiThuongKeTiep(GiaiThuong g) {
        ketiep = g;
        return ketiep;
    }

    @Override
    public String doVeSo(String ve_so) {
        for(var c: soTrungThuongs) {
            sub = ve_so.substring(ve_so.length() - c.length());
            int count = 0;
            for(int i = 0; i < sub.length(); i++) {
                if(sub.charAt(i) == c.charAt(i))
                    count++;
            }
            if(count == c.length() - 1) return "Bạn đã trúng giải khuyến khích: ";
        }
        return ketiep.doVeSo(ve_so);
    }
}
