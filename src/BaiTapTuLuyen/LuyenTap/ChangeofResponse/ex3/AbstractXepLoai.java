package BaiTapTuLuyen.LuyenTap.ChangeofResponse.ex3;

public abstract class AbstractXepLoai {
    int min, max;
    String xepLoai;

    public AbstractXepLoai(int min, int max, String xepLoai) {
        this.min = min;
        this.max = max;
        this.xepLoai = xepLoai;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public String getXepLoai() {
        return xepLoai;
    }

    public void setXepLoai(String xepLoai) {
        this.xepLoai = xepLoai;
    }

    public abstract AbstractXepLoai xepLoaiKeTiep(AbstractXepLoai x);
    public abstract void xuLy(int diem);
}
