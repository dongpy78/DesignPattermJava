package Structural_Patterm.Composite.Folder;

import java.util.ArrayList;
import java.util.List;

public class Folder extends AbstractFile {

    List<AbstractFile> children;

    public Folder(String ten, String ngay_tao) {
        super(ten, ngay_tao);
        this.children = new ArrayList<>();
    }

    @Override
    public void add(AbstractFile f) {
        children.add(f);
        f.duong_dan += this.duong_dan + "\\" + f.ten;
    }

    @Override
    public void remove(AbstractFile f) {
        children.remove(f);
    }

    @Override
    public String getStringTreeFolder(String space) {
        StringBuilder builder = new StringBuilder();
        builder.append(this.ten);
        for (AbstractFile f:children) {
            builder.append("\n" + space + "|___").append(f.getStringTreeFolder(space + "    "));
        }
        return builder.toString();
    }
}
