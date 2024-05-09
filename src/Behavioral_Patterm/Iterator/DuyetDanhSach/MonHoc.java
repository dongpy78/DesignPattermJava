package Behavioral_Patterm.Iterator.DuyetDanhSach;

public class MonHoc {
    String ten;
    int sotc;

    public MonHoc(String ten, int sotc) {
        this.ten = ten;
        this.sotc = sotc;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Tên môn học: " + ten)
                .append(" - Số tín chỉ: " + sotc);
        return builder.toString();
    }
}
