package BaiTapTuLuyen.LuyenTap.Composite.B3;

public class File extends AbstractFile{


    public File(String ten, String ngayTao) {
        super(ten, ngayTao);
    }

    @Override
    public void add(AbstractFile f) {

    }

    @Override
    public void remove(AbstractFile f) {

    }

    @Override
    public String getStringTreeFolder(String space) {
        return ten;
    }
}
