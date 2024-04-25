package Behavioral_Patterm.ChangeOfResponsibility.XepLoai;

public class XepLoaiThongThuong extends AbstractXepLoai{
    AbstractXepLoai ketiep;

    public XepLoaiThongThuong(int mucdiem, String hocluc) {
        super(mucdiem, hocluc);
    }

    @Override
    public AbstractXepLoai xepLoaiMucTiepTheo(AbstractXepLoai m) {
        ketiep = m;
        return ketiep;
    }

    @Override
    public void xeploai(int diem) {
        if (diem < mucdiem) {
            System.out.println("Hoc luc: " + hocluc);
        } else if (ketiep != null) {
            ketiep.xeploai(diem);
        } else {
            System.out.println("Khong xep loai");
        }
    }
}
