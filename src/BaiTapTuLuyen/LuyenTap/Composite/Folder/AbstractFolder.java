package BaiTapTuLuyen.LuyenTap.Composite.Folder;


public abstract class AbstractFolder {
    protected String name;
    protected String duongDan;

    public AbstractFolder(String name) {
        this.name = name;
        this.duongDan = name;
    }

    public abstract void add(AbstractFolder f);
    public abstract void remove(AbstractFolder f);
    public abstract String duongDan(String s);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDuongDan() {
        return duongDan;
    }

    public void setDuongDan(String duongDan) {
        this.duongDan = duongDan;
    }
}