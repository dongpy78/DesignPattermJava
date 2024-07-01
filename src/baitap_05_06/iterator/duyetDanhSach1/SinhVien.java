package baitap_05_06.iterator.duyetDanhSach1;

public class SinhVien {
    String ten;
    String diachi;
    String namsinh;

    public SinhVien(String ten, String diachi, String namsinh) {
        this.ten = ten;
        this.diachi = diachi;
        this.namsinh = namsinh;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Tên: " + ten).append(" - Địa chỉ: " + diachi).append(" - Năm sinh: " + namsinh);
        return builder.toString();
    }

}
