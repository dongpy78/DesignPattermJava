package baitap_06_06.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void duyetDanhSach(Iterator<MonHoc> iterator) {
        while (iterator.hasNext()) {
            MonHoc monHoc = iterator.next();
            System.out.println(monHoc.toString());
        }
    }
    public static void main(String[] args) {
        List<MonHoc> monHocs = new ArrayList<>(Arrays.asList(
                new MonHoc("Dong", "Dat", 30),
                new MonHoc("Dong", "Dat", 30),
                new MonHoc("Dong", "Dat", 30),
                new MonHoc("Dong", "Dat", 30)
        ));
        duyetDanhSach(monHocs.iterator());
    }
}
