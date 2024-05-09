package BaiTapTuLuyen.LuyenTap.lamxongxoa.CB3;

public class MainMucDien {
    public static void main(String[] args) {
        Abstract_MucDien m1 = new MucDien("Bac 1", 0, 50, 1728);
        Abstract_MucDien m2 = new MucDien("Bac 2", 50, 100, 1866);
        m1.mucDienKeTiep(m2);
        int sokw = 55;
        System.out.println("So kw dien cua ban la: " + sokw + " --> Tien dien: " + m1.xuLy(sokw));
    }
}
