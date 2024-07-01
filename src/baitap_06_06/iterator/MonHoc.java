package baitap_06_06.iterator;

public class MonHoc {
    String id;
    String ten;
    int sotc;

    public MonHoc(String id, String ten, int sotc) {
        this.id = id;
        this.ten = ten;
        this.sotc = sotc;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Ma mon hoc: " + id).append(" - Ten mon hoc: "+ ten).append(" - So tin chi: " + sotc);
        return builder.toString();
    }
}
