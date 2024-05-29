package BaiTapThucHanh.ChangeOfRes;

import java.util.List;

public class GiaiUt extends GiaiThuong{
    String tenGiaiThuong;
    List<String> soTrungThuongs;

    public GiaiUt(String tenGiaiThuong, List<String> soTrungThuongs) {
        this.tenGiaiThuong = tenGiaiThuong;
        this.soTrungThuongs = soTrungThuongs;
    }

    @Override
    public GiaiThuong giaiThuongKeTiep(GiaiThuong g) {
        return null;
    }

    @Override
    public String doVeSo(String ve_so) {
        for(var c: soTrungThuongs)
            if(ve_so.endsWith(c)) return "Bạn đã trúng giải: " + tenGiaiThuong;
        return "Chúc bạn may mắn lần sau!";
    }
}
