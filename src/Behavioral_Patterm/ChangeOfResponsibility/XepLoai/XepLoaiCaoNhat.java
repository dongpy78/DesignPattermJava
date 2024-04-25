package Behavioral_Patterm.ChangeOfResponsibility.XepLoai;

public class XepLoaiCaoNhat extends AbstractXepLoai{
    public XepLoaiCaoNhat(int mucdiem, String hocluc) {
        super(mucdiem, hocluc);
    }

    @Override
    public AbstractXepLoai xepLoaiMucTiepTheo(AbstractXepLoai m) {
        System.out.println("Hoc luc: " + m.hocluc);
        return null;
    }

    @Override
    public void xeploai(int diem) {
        System.out.println("Hoc luc: " + hocluc);
    }


}
