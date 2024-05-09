package BaiTapThucHanh.observer.CA1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyStream<List<MonHoc>> stream = new MyStream<>();
        DataAccess dataAccess = new DataAccess(stream);

        Client client = new Client(stream);

        System.out.println("Lan 1");
        dataAccess.them(new MonHoc("01td", "The duc", 3));
        System.out.println("Lan 2");
        dataAccess.them(new MonHoc("02td", "The duc", 3));
        System.out.println("Lan 3");
        dataAccess.xoa("01td");

    }
}
