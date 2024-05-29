package test_13_05_2024.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void duyet_danh_sach(Iterator<SinhVien> iterator) {
        while (iterator.hasNext()) {
            SinhVien sinhVien = iterator.next();
            System.out.println(sinhVien.toString());
        }
    }
    public static void main(String[] args) {
        List<SinhVien> sinhViens = new ArrayList<>(Arrays.asList(
                new SinhVien("a", 1, "asdsadasd"),
                new SinhVien("a", 1, "asdsadasd"),
                new SinhVien("a", 1, "asdsadasd"),
                new SinhVien("a", 1, "asdsadasd"),
                new SinhVien("a", 1, "asdsadasd"),
                new SinhVien("a", 1, "asdsadasd")
        ));
        duyet_danh_sach(sinhViens.iterator());
    }
}
