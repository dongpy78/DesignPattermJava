package Behavioral_Patterm.ChangeOfResponsibility.CB1;

public class MenhGiaThapNhat extends ATM_TheoMenhGia{
    public MenhGiaThapNhat(int menhGia) {
        super(menhGia);
    }

    @Override
    public ATM_TheoMenhGia menhGiaKeTiep(ATM_TheoMenhGia m) {
        return null;
    }

    @Override
    public void rutTien(int soTien) {
        int soto = soTien / menhGia;
        System.out.println("- " + soto + " tờ mệnh giá " + menhGia);
    }
}
