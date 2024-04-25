package Behavioral_Patterm.ChangeOfResponsibility.XepLoai;

public abstract class AbstractXepLoai {
    int mucdiem;
    String hocluc;
    public abstract AbstractXepLoai xepLoaiMucTiepTheo(AbstractXepLoai m);
    public abstract void xeploai(int diem);

    public int getMucdiem() {
        return mucdiem;
    }

    public void setMucdiem(int mucdiem) {
        this.mucdiem = mucdiem;
    }

    public String getHocluc() {
        return hocluc;
    }

    public void setHocluc(String hocluc) {
        this.hocluc = hocluc;
    }

    public AbstractXepLoai(int mucdiem, String hocluc) {
        this.mucdiem = mucdiem;
        this.hocluc = hocluc;
    }
}
