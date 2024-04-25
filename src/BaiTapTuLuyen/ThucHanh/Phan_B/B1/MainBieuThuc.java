package BaiTapTuLuyen.ThucHanh.Phan_B.B1;

public class MainBieuThuc {
    public static void main(String[] args) {
        BieuThuc b = new BieuThucDonGian(10);
        b = new Cong(b, 10);
        System.out.println(b.bieuThuc() + " = " +  b.giaTri());


        
    }
}

