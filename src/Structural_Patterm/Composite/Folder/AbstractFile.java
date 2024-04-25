package Structural_Patterm.Composite.Folder;

public abstract class AbstractFile {
    String ten, ngay_tao, duong_dan;
    public abstract void add(AbstractFile f);
    public abstract void remove(AbstractFile f);

    public abstract String getStringTreeFolder(String space);

    public String getPath() {
        return duong_dan;
    }

    public AbstractFile(String ten, String ngay_tao) {
        this.ten = ten;
        this.ngay_tao = ngay_tao;
        this.duong_dan = ten;
    }
}
