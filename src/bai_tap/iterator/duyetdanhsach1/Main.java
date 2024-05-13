package bai_tap.iterator.duyetdanhsach1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void duyetMonHoc(Iterator<MonHoc> iterator) {
        while (iterator.hasNext()) {
            MonHoc monHoc = iterator.next();
            System.out.println(monHoc.toString());
        }
    }
    public static void main(String[] args) {
        List<MonHoc> monHocs = new ArrayList<>(Arrays.asList(
                new MonHoc("Hệ điều hành", 3),
                new MonHoc("Xác suất thống kê", 3)
        ));
        duyetMonHoc(monHocs.iterator());
    }
}
