package BaiTapThucHanh.observer.CA1;

public class MonHoc {
    String id;
    String ten;
    int sotc;

    public MonHoc(String id, String ten, int sotc) {
        this.id = id;
        this.ten = ten;
        this.sotc = sotc;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getSotc() {
        return sotc;
    }

    public void setSotc(int sotc) {
        this.sotc = sotc;
    }

    @Override
    public String toString() {
        return "MonHoc{" +
                "id='" + id + '\'' +
                ", ten='" + ten + '\'' +
                ", sotc=" + sotc +
                '}';
    }
}
