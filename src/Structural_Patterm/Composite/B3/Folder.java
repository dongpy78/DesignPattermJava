package Structural_Patterm.Composite.B3;

import java.util.ArrayList;
import java.util.List;

public class Folder implements IFolder{
    String name;
    List<IFolder> items;

    public Folder(String name) {
        this.name = name;
        this.items = new ArrayList<>();
    }

    public void add(IFolder item) {
        items.add(item);
    }

    public void remove(IFolder item) {
        items.remove(item);
    }

    @Override
    public String getString() {
        StringBuilder builder = new StringBuilder();
        builder.append(this.getPath()).append("\n");
        for(var c: items) {
            builder.append("\t").append(c.getString()).append("\n");
        }
        return builder.toString();
    }

    @Override
    public String getPath() {
        return name;
    }
}
