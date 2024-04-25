package BaiTapTuLuyen.LuyenTap.Composite.LuyenTap.KhoaBoMon;



public class Main {
    public static void main(String[] args) {
        AbstractKhoa khoa =  new BoMon("CNTT");
        AbstractKhoa httt = new BoMon("HTTT");
        AbstractKhoa cnpm = new BoMon("CNPM");
        AbstractKhoa gv1 = new GiangVien("Dinh Hung");
        AbstractKhoa gv2 = new GiangVien("Huong Ly");
        AbstractKhoa gv3 = new GiangVien("Van Dong");
        cnpm.add(gv3);
        httt.add(gv1);
        httt.add(gv2);
        khoa.add(httt);
        khoa.add(cnpm);
        System.out.println(khoa.getHierachy("  "));


    }
}
