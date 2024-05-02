package BaiTapTuLuyen.LuyenTap.ChangeofResponse.ex2;

public class TienDienMucCaoNhat extends Abstract_TienDien{
    public TienDienMucCaoNhat(String tenbac, int min, int max, int mucGia) {
        super(tenbac, min, max, mucGia);
    }

    @Override
    public Abstract_TienDien tienDienMucKeTiep(Abstract_TienDien t) {
        return null;
    }

    @Override
    public int xuLy(int sokw) {
        return (sokw - min) * mucGia;
    }
}
