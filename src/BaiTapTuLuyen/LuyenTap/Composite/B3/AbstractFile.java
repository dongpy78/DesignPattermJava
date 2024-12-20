package BaiTapTuLuyen.LuyenTap.Composite.B3;

public abstract class AbstractFile {
    String ten, ngayTao, duongDan;
    public abstract void add(AbstractFile f);
    public abstract void remove(AbstractFile f);

    public abstract String getStringTreeFolder(String space);

    public AbstractFile(String ten, String ngayTao) {
        this.ten = ten;
        this.ngayTao = ngayTao;
        this.duongDan = ten;
    }
}
