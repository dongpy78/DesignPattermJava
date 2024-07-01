package baitap_05_06.iterator.duyetDanhSach1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void duyetDanhSach(Iterator<SinhVien> iterator) {
        while (iterator.hasNext()) {
            SinhVien sinhVien = iterator.next();
            System.out.println(sinhVien.toString());
        }
    }
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>(Arrays.asList(
                "dong", "dat", "ha", "tan"
        ));
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
