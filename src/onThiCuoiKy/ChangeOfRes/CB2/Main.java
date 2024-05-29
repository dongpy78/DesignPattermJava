package onThiCuoiKy.ChangeOfRes.CB2;

public class Main {
    public static void main(String[] args) {
        AbstractMucDien m1 = new MucDien(0, 20, 30);
        AbstractMucDien m2 = new MucDien(21, 30, 40);
        AbstractMucDien m3 = new MucDien(31, 40, 50);
        AbstractMucDien m4 = new MucDien(41, 50, 60);
        m1.mucDienKeTiep(m2).mucDienKeTiep(m3).mucDienKeTiep(m4);
        System.out.println(m1.xuLy(30));
    }
}
