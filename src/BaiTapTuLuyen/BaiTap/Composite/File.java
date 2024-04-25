package BaiTapTuLuyen.BaiTap.Composite;

public class File extends AbstractFolder {



    public File(String name) {
        super(name);
    }

    @Override
    public void add(AbstractFolder f) {

    }

    @Override
    public void remove(AbstractFolder f) {

    }


    @Override
    public String duongDan(String s) {
        return s + name;
    }


}