package baitap_04_06.observer.CA1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyStream<List<MonHoc>> stream = new MyStream<>();
        Client client = new Client(stream);
        DataAccess dataAccess = new DataAccess(stream);

        System.out.println("Lần 1: ");
        dataAccess.them(new MonHoc("mh_01", "Toán", 3));
        System.out.println("Lần 2: ");
        dataAccess.them(new MonHoc("mh_02", "Tiếng Anh", 3));
        System.out.println("Lần 3: ");
        dataAccess.them(new MonHoc("mh_03", "Lý", 3));

        System.out.println("Xóa Môn học");
        dataAccess.xoa("mh_02");
        System.out.println("Xóa");
        dataAccess.xoa("mh_03");


    }
}
