package Structural_Patterm.Composite.Folder;

public class File extends AbstractFile{


    public File(String ten, String ngay_tao) {
        super(ten, ngay_tao);
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
