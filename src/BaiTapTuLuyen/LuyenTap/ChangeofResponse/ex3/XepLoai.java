package BaiTapTuLuyen.LuyenTap.ChangeofResponse.ex3;

public class XepLoai extends AbstractXepLoai{
    AbstractXepLoai ketiep;
    public XepLoai(int min, int max, String xepLoai) {
        super(min, max, xepLoai);
    }

    @Override
    public AbstractXepLoai xepLoaiKeTiep(AbstractXepLoai x) {
        ketiep = x;
        return ketiep;
    }

    @Override
    public void xuLy(int diem) {
        if(diem < 0) System.out.println("Diem nhap vao khong duoc nho hon 0. Xin kiem tra lai!");
        else if(diem >= min && diem < max) System.out.println("Diem cua ban la: " + diem + " --> Xep loai cua ban: " + xepLoai);
        else ketiep.xuLy(diem);
    }
}
