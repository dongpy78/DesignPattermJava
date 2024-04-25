package Structural_Patterm.Decorator.B4_TH;

import Structural_Patterm.Composite.folder_test.AbstractFolder;

import java.util.ArrayList;
import java.util.List;

public class KeHoachChung extends KeHoachHocTap{
    List<KeHoachHocTap> khhts;

    public KeHoachChung(String ten) {
        super(ten);
        this.khhts = new ArrayList<>();
    }

    @Override
    public void addKeHoachHocTap(KeHoachHocTap k) {
        khhts.add(k);
        k.setDuongDan(khhts + " - " + k.getDuongDan());
    }

    @Override
    public void removeKeHoachHocTap(KeHoachHocTap k) {
        khhts.remove(k);
    }

//    @Override
//    public int getSoTC() {
//        return 0;
//    }

    @Override
    public int getSoTC() {
        int stc = 0;
        for(var k: khhts) {
            stc += k.getSoTC();
        }
        return stc;
    }

    @Override
    public int getHocPhi() {
        int hocPhi = 0;
        for(var k: khhts) {
            hocPhi += k.getHocPhi();
        }
        return hocPhi;
    }

    @Override
    public String getThongTin() {
        return "";
    }

    @Override
    public String duongDan(String s) {
        StringBuilder builder = new StringBuilder();
        builder.append(s).append(this.ten).append(" - Tổng số tín chỉ: ").append(getSoTC()).append(" - Tổng học phí: ").append(getHocPhi());
        for(var c: khhts) {
            builder.append("\n").append(c.duongDan(s + " ")).append(" - ").append(c.getThongTin());
        }
        return builder.toString().replaceAll(" - $", "");
    }
}
