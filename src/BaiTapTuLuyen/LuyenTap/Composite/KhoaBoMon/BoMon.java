package BaiTapTuLuyen.LuyenTap.Composite.KhoaBoMon;

import java.util.ArrayList;
import java.util.List;

public class BoMon extends AbstractKhoa{
    List<AbstractKhoa> children;

    public BoMon(String name) {
        super(name);
        this.children = new ArrayList<>();
    }

    @Override
    public void add(AbstractKhoa entries) {
        children.add(entries);
        entries.setParents(parents + " - " + entries.getParents());
    }

    @Override
    public void remove(AbstractKhoa entries) {
        children.remove(entries);
    }

    @Override
    public String getHierarchy(String s) {
        StringBuilder builder = new StringBuilder();
        builder.append(s).append(this.name);
        for(var c: children) {
            builder.append("\n").append(c.getHierarchy(" " + s));
        }


        return builder.toString();
    }
}
