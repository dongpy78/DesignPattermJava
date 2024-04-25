package BaiTapTuLuyen.LuyenTap.Composite.Folder;

public class Main {
    public static void main(String[] args) {
        AbstractFolder f1 = new File("Bai 1");
        AbstractFolder folder = new Folder("Bai 2");


        folder.add(f1);
        System.out.println(folder.duongDan(" "));
    }
}
