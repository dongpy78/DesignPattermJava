package BaiTapTuLuyen.BaiTap.Composite;

public abstract class AbstractFolder {
    String name;
    String duongDan;

    public AbstractFolder(String name) {
        this.name = name;
        this.duongDan = name;
    }

    public abstract void add(AbstractFolder f);
    public abstract void remove(AbstractFolder f);

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

    public abstract String duongDan(String s);
}
