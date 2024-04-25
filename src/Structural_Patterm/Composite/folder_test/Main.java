package Structural_Patterm.Composite.folder_test;

public class Main {
    public static void main(String[] args) {
        AbstractFolder file_1 = new File("File 1");
        AbstractFolder file_2 = new File("File_2");
        AbstractFolder file_3 = new File("File_2");
        AbstractFolder file_4 = new File("File_2");
        AbstractFolder folder_1 = new Folder("D");
        AbstractFolder folder_2 = new Folder("E");
        AbstractFolder folder_3 = new Folder("main");
        AbstractFolder root = new Folder("trum");
        folder_1.add(file_1);
        folder_2.add(file_2);
        folder_3.add(folder_1);
        folder_3.add(folder_2);
        root.add(folder_3);
        System.out.println(root.duongDan(" "));
    }


}
