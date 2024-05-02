package BaiTapTuLuyen.LuyenTap.ChangeofResponse.ex2;

public class Main {
    public static void main(String[] args) {
        Abstract_TienDien t1 = new TienDien("Bac 1", 0, 50, 1728);
        Abstract_TienDien t2 = new TienDien("Bac 2", 50, 100, 1868);
        t1.tienDienMucKeTiep(t2);
        System.out.println(t1.xuLy(55));
    }
}
