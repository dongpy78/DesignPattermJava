package BaiTapTuLuyen.LuyenTap.ChangeofResponse.ex2;

public class TienDien extends Abstract_TienDien {
    Abstract_TienDien ketiep;
    public TienDien(String tenbac, int min, int max, int mucGia) {
        super(tenbac, min, max, mucGia);
    }

    @Override
    public Abstract_TienDien tienDienMucKeTiep(Abstract_TienDien t) {
        ketiep = t;
        return ketiep;
    }

    @Override
    public int xuLy(int sokw) {
        if(sokw <= max) return (sokw - min) * mucGia;
        else return (max - min) * mucGia + ketiep.xuLy(sokw);
    }
}



