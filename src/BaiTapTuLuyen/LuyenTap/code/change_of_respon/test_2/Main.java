package BaiTapTuLuyen.LuyenTap.code.change_of_respon.test_2;

public class Main {
    public static void main(String[] args) {
        AbstractMucDien m1 = new MucDien(0, 50, 1728);
        AbstractMucDien m2 = new MucDien(50, 100, 1786);
        m1.mucDienKeTiep(m2);
        int sokw = 55;
        System.out.println("Số kw điện bạn sử dụng: " + sokw + " --> Tiền điện của bạn: " + m1.xuLy(sokw));
    }
}
