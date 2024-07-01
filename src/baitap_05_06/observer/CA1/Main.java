package baitap_05_06.observer.CA1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Stream<List<MonHoc>> stream = new Stream<>();
        DataAccess dataAccess = new DataAccess(stream);
        Client client = new Client(stream);

        System.out.println("Lan 1");
        dataAccess.them(new MonHoc("mh01", "Toan", 3));
        System.out.println("Lan 2");
        dataAccess.them(new MonHoc("mh02", "TA", 3));
        System.out.println("Lan 3");
        dataAccess.them(new MonHoc("mh03", "Tieng Viet", 3));

    }
}
