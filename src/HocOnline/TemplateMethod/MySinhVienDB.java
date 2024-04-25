package HocOnline.TemplateMethod;

// Lop quan ly cac doi tuong MySinhVien

public class MySinhVienDB extends ObjectDB<MySinhVien> {

    @Override
    public int getId(MySinhVien mySinhVien) {
        return mySinhVien.getMaSV();
    }
}
