package BaiTapTuLuyen.LuyenTap.Composite.B3;

public class Main {
    public static void main(String[] args) {
        AbstractFile a = new File("abc", "10-10");
        AbstractFile b = new File("bvc", "29");

        AbstractFile folder = new Folder("D", "10-10");
        folder.add(a);
        folder.add(b);
        System.out.println(folder.getStringTreeFolder(""));
    }
}
