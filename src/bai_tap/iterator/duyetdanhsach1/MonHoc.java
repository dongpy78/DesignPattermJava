package bai_tap.iterator.duyetdanhsach1;

public class MonHoc {
    String tenMonHoc;
    int soTinChi;

    public MonHoc(String tenMonHoc, int soTinChi) {
        this.tenMonHoc = tenMonHoc;
        this.soTinChi = soTinChi;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Tên môn học: " + tenMonHoc).append(" - Số tín chỉ: " + soTinChi);
        return builder.toString();
    }
}
