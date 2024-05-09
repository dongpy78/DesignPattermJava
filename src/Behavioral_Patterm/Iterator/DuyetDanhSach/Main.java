package Behavioral_Patterm.Iterator.DuyetDanhSach;


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
                new MonHoc("Mon hoc 1", 2),
                new MonHoc("Mon hoc 2", 2),
                new MonHoc("Mon hoc 3", 2),
                new MonHoc("Mon hoc 4", 2)
        ));
        duyetMonHoc(monHocs.iterator());
    }
}
