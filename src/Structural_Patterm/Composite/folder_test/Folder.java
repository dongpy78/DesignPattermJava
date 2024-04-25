package Structural_Patterm.Composite.folder_test;

import java.util.ArrayList;
import java.util.List;

public class Folder extends AbstractFolder{
    List<AbstractFolder> children;
    public Folder(String name) {
        super(name);
        this.children = new ArrayList<>();
    }
    @Override
    public void add(AbstractFolder f) {
        children.add(f);
        f.setDuongDan(children + " - " + f.getDuongDan());
    }

    @Override
    public void remove(AbstractFolder f) {
        f.remove(f);
    }
    @Override
    public String duongDan(String s) {
        StringBuilder builder = new StringBuilder();
        builder.append(s).append(this.name);
        for(var c: children) {
            builder.append("\n").append(c.duongDan(s + " "));
        }
        return builder.toString();
    }
}
