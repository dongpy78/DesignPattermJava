package bai_tap.change_of_res.doveso;

public class GiaiThuong extends AbstractDoVeSo{
    AbstractDoVeSo ketiep;
    String tenGiai;
    String[] soTrungThuong;

    public GiaiThuong(String tenGiai, String[] soTrungThuong) {
        this.tenGiai = tenGiai;
        this.soTrungThuong = soTrungThuong;
    }

    @Override
    public AbstractDoVeSo veSoKeTiep(AbstractDoVeSo d) {
        ketiep = d;
        return ketiep;
    }

    @Override
    public String doveSo(String veso) {
        for(var c: soTrungThuong)
            if(veso.endsWith(c)) return "Bạn đã trúng giải: " + tenGiai;
        return ketiep.doveSo(veso);
    }
}
