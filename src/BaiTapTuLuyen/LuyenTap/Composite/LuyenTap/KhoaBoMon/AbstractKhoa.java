package BaiTapTuLuyen.LuyenTap.Composite.LuyenTap.KhoaBoMon;

public abstract class AbstractKhoa {
    protected String name;
    protected String parents;

    public AbstractKhoa(String name) {
        this.name = name;
        this.parents = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParents() {
        return parents;
    }

    public void setParents(String parents) {
        this.parents = parents;
    }

    public abstract void add(AbstractKhoa entries);
    public abstract void remove(AbstractKhoa entries);
    public abstract String getHierachy(String s);

}
