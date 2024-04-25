package Behavioral_Patterm.ChangeOfResponsibility.CB1;

public class MenhGia extends ATM_TheoMenhGia{
    ATM_TheoMenhGia ketiep;

    public MenhGia(int menhGia) {
        super(menhGia);
    }

    @Override
    public ATM_TheoMenhGia menhGiaKeTiep(ATM_TheoMenhGia m) {
        ketiep = m;
        return ketiep;
    }

    @Override
    public void rutTien(int soTien) {
        int so_to = soTien / menhGia;
        int so_du = soTien % menhGia;
//        if(so_to > 0) System.out.println(so_to + "");

        if (so_to > 0) {
            System.out.println("- " + so_to + " tờ mệnh giá " + menhGia);
        }
        if (so_du > 0 && ketiep != null) {
            ketiep.rutTien(so_du);
        }
    }
}
