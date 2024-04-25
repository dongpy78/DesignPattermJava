package BaiTapTuLuyen.ThucHanh.Phan_A.A5;

public class MainBooks {
    public static void main(String[] args) {
        Books books = new Books.Builder().setTuaDe("SDooisadf").setTacGia("DOng").setSoTrang(20).setDs_chuong("Chuong 1").build();
        System.out.println(books.toString());
    }
}
