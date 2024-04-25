package BaiTapTuLuyen.LuyenTap.test;

public class ThongTinSach {
    String tuaDe;
    int soTrang;
    String tacGia;

    public ThongTinSach(String tuaDe, int soTrang, String tacGia) {
        this.tuaDe = tuaDe;
        this.soTrang = soTrang;
        this.tacGia = tacGia;
    }

    public String getTuaDe() {
        return tuaDe;
    }

    public void setTuaDe(String tuaDe) {
        this.tuaDe = tuaDe;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    @Override
    public String toString() {
        return "ThongTinSach{" +
                "tuaDe='" + tuaDe + '\'' +
                ", soTrang=" + soTrang +
                ", tacGia='" + tacGia + '\'' +
                '}';
    }
}
