package baitap_06_06.observer.CA1;



import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Stream<List<MonHoc>> stream = new Stream<>();
        Client client = new Client(stream);
        DataAccess dataAccess = new DataAccess(stream);
        dataAccess.them(new MonHoc("mh01", "Mau thiet ke", 3));
        dataAccess.them(new MonHoc("mh02", "Mau", 3));
        dataAccess.them(new MonHoc("mh03", "thiet ke", 3));
        System.out.println("Sau khi xoa!");
        dataAccess.xoa("mh03");
    }
}
