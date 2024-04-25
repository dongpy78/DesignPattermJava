package BaiTapTuLuyen.LuyenTap.Composite.B3;

import BaiTapTuLuyen.ThucHanh.Phan_A.A5.Books;

import java.util.ArrayList;
import java.util.List;

public class Folder extends AbstractFile {
    List<AbstractFile> children;

    public Folder(String ten, String ngayTao) {
        super(ten, ngayTao);
        this.children = new ArrayList<>();
    }

    @Override
    public void add(AbstractFile f) {
        children.add(f);
        f.duongDan += this.duongDan + "\\" + f.ten;
    }

    @Override
    public void remove(AbstractFile f) {
        children.remove(f);
    }

    @Override
    public String getStringTreeFolder(String space) {
        StringBuilder builder = new StringBuilder();
        builder.append(this.ten);
        for (var c: children) {
            builder.append("\n" + space + "|__").append(c.getStringTreeFolder(space + "   "));
        }
        return builder.toString();
    }
}
