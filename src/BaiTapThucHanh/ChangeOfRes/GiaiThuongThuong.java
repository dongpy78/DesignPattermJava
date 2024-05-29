package BaiTapThucHanh.ChangeOfRes;

import java.util.ArrayList;
import java.util.List;

public class GiaiThuongThuong extends GiaiThuong {
    GiaiThuong ketiep;
    String tenGiaiThuong;
    List<String> soTrungThuongs;

    public GiaiThuongThuong(String tenGiaiThuong, List<String> soTrungThuongs) {
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
        for(var c: soTrungThuongs)
            if(ve_so.endsWith(c))
                return "Bạn đã trúng giải: " + tenGiaiThuong;
        return ketiep.doVeSo(ve_so);
    }
}
