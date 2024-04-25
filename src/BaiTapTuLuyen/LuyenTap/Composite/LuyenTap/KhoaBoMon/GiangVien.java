package BaiTapTuLuyen.LuyenTap.Composite.LuyenTap.KhoaBoMon;

public class GiangVien extends AbstractKhoa {


    public GiangVien(String name) {
        super(name);
    }

    @Override
    public void add(AbstractKhoa entries) {

    }

    @Override
    public void remove(AbstractKhoa entries) {

    }

    @Override
    public String getHierachy(String s) {
        return s + name;
    }
}
