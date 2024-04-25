package BaiTapTuLuyen.ThucHanh.Phan_A.A5;

import java.util.ArrayList;
import java.util.List;

public class Books {
    String tuaDe;
    int soTrang;
    String tacGia;
    List<String> chuong;

    protected Books(Builder b) {
        this.tuaDe = b.tuaDe;
        this.soTrang = b.soTrang;
        this.tacGia = b.tacGia;
        this.chuong = b.ds_chuong;
    }

    @Override
    public String toString() {
        return "Books{" +
                "tuaDe='" + tuaDe + '\'' +
                ", soTrang=" + soTrang +
                ", tacGia='" + tacGia + '\'' +
                ", chuong=" + chuong +
                '}';
    }

    public static class Builder {
        String tuaDe;
        int soTrang;
        String tacGia;
        List<String> ds_chuong = new ArrayList<>();

        public Builder setTuaDe(String tuaDe) {
            this.tuaDe = tuaDe;
            return this;
        }

        public Builder setSoTrang(int soTrang) {
            this.soTrang = soTrang;
            return this;
        }

        public Builder setTacGia(String tacGia) {
            this.tacGia = tacGia;
            return this;
        }

        public Builder setDs_chuong(String ds_chuong) {
            this.ds_chuong.add(ds_chuong);
            return this;
        }

        public Books build() {
            return new Books(this);
        }
    }

}
