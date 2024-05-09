package Behavioral_Patterm.Iterator.test1;

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
            List<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
            Iterator iterator = list.iterator();


            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }


            System.out.println("Cach 2");
            Iterator<Integer> iterator2 = list.iterator();
            iterator2.forEachRemaining(integer -> System.out.println(integer));

            List<MonHoc> monHocs = new ArrayList<>(Arrays.asList(
                    new MonHoc("The duc", 1),
                    new MonHoc("The duc", 1),
                    new MonHoc("The duc", 1)

            ));
            duyetMonHoc(monHocs.iterator());
        }



    }
