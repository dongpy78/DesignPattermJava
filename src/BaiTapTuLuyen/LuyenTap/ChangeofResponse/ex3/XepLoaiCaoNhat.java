package BaiTapTuLuyen.LuyenTap.ChangeofResponse.ex3;

public class XepLoaiCaoNhat extends AbstractXepLoai{
    public XepLoaiCaoNhat(int min, int max, String xepLoai) {
        super(min, max, xepLoai);
    }

    @Override
    public AbstractXepLoai xepLoaiKeTiep(AbstractXepLoai x) {
        return null;
    }

    @Override
    public void xuLy(int diem) {
        System.out.println("Diem cua ban la: " + diem + " --> Xep loai cua ban: " + xepLoai);
    }
}
