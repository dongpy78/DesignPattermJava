package baitap_04_06.observer.CA1;

public class MonHoc {
    String id, ten;
    int sotc;

    public MonHoc(String id, String ten, int sotc) {
        this.id = id;
        this.ten = ten;
        this.sotc = sotc;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Mã môn học: " + id).append(" - Tên môn học: " + ten).append(" - Số tín chỉ: " + sotc);
        return builder.toString();
    }
}
