package Structural_Patterm.Composite.B3;

public class Main {
    public static void main(String[] args) {
        File f2 = new File("bvd");
        File f3 = new File("bvd");
        Folder folder1 = new Folder("Hello");
        folder1.add(f2);
        System.out.println(folder1.getString());
    }
}
