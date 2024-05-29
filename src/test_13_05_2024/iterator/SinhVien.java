package test_13_05_2024.iterator;

public class SinhVien {
    String name;
    int age;
    String address;

    public SinhVien(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Tên: " + name).append(" - Tuổi: " + age).append(" - Address: " + address);
        return builder.toString();
    }
}
