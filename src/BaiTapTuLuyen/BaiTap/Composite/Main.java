package BaiTapTuLuyen.BaiTap.Composite;

import Structural_Patterm.Composite.folder_test.AbstractFolder;
import Structural_Patterm.Composite.folder_test.File;
import Structural_Patterm.Composite.folder_test.Folder;

public class Main {
    public static void main(String[] args) {
        AbstractFolder f1 = new File("s");
        AbstractFolder f2 = new Folder("D");
        f2.add(f1);
        System.out.println(f2.duongDan(" "));
    }
}
