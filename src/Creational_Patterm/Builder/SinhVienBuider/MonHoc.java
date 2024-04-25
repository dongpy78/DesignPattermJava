package Creational_Patterm.Builder.SinhVienBuider;

public class MonHoc {
    String tenMH;
    int soTC;
    String maMH;

    public MonHoc(String tenMH, int soTC, String maMH) {
        this.tenMH = tenMH;
        this.soTC = soTC;
        this.maMH = maMH;
    }

    public String getTenMH() {
        return tenMH;
    }

    public void setTenMH(String tenMH) {
        this.tenMH = tenMH;
    }

    public int getSoTC() {
        return soTC;
    }

    public void setSoTC(int soTC) {
        this.soTC = soTC;
    }

    public String getMaMH() {
        return maMH;
    }

    public void setMaMH(String maMH) {
        this.maMH = maMH;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("\n + Ten MH: ").append(tenMH).append(" | So tc: ")
                .append(soTC).append(" | Ma MH: ").append(maMH);
        return builder.toString();
    }
}
