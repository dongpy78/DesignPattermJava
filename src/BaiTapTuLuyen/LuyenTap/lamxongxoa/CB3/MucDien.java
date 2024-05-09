package BaiTapTuLuyen.LuyenTap.lamxongxoa.CB3;


import BaiTapTuLuyen.LuyenTap.code.change_of_respon.test_2.AbstractMucDien;

public class MucDien extends Abstract_MucDien {
    Abstract_MucDien ketiep;
    public MucDien(String bac, int min, int max, int mucGia) {
        super(bac, min, max, mucGia);
    }

    @Override
    public Abstract_MucDien mucDienKeTiep(Abstract_MucDien m) {
        ketiep = m;
        return ketiep;
    }

    @Override
    public int xuLy(int soKw) {
        if(soKw <= max) return (soKw - min) * mucGia;
        else return (max - min) * mucGia + ketiep.xuLy(soKw);
    }


}
