package BaiTapTuLuyen.LuyenTap.Composite.KhoaBoMon;

public class Main {
    public static void main(String[] args) {
        AbstractKhoa khoa = new BoMon("CNTT");
        AbstractKhoa httt = new BoMon("He Thong Thong Tin");
        AbstractKhoa cnpm = new BoMon("Cong nghe phan mem");

        AbstractKhoa gv1 = new GiangVien("Nguyen Dinh Hung");
        AbstractKhoa gv2 = new GiangVien("Mai Cuong Tho");
        AbstractKhoa gv3 = new GiangVien("Nguyen Thi Huong Ly");

        httt.add(gv3);
        cnpm.add(gv1);
        cnpm.add(gv2);

        khoa.add(httt);
        khoa.add(cnpm);

        System.out.println(khoa.getHierarchy("-"));
    }

}
