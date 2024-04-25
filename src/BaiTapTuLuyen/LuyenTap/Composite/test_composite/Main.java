package BaiTapTuLuyen.LuyenTap.Composite.test_composite;

public class Main {
    public static void main(String[] args) {
        AbstractFolder file_1 = new File("Bai 1");
        AbstractFolder file_2 = new File("Bai 2");
        AbstractFolder file_3 = new File("Bai 3");AbstractFolder file_4 = new File("Bai 4");
        AbstractFolder file_5 = new File("Bai 5");

        AbstractFolder folder_1 = new Folder("D");
        AbstractFolder folder_2 = new Folder("D");

        AbstractFolder main = new Folder("main");

        folder_1.add(file_1);
        folder_1.add(file_2);
        folder_1.add(file_3);


        folder_2.add(file_4);
        folder_2.add(file_5);

        main.add(folder_1);
        main.add(folder_2);
        System.out.println(main.duongDan("        "));
    }
}
