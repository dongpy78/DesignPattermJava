package bai_tap.iterator.duyetdanhsach2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>(Arrays.asList("Ha Noi", "Ninh Binh", "Phu Yen"));
        Iterator iterator = list.iterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
