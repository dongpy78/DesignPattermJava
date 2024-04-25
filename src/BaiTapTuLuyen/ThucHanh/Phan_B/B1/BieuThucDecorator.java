package BaiTapTuLuyen.ThucHanh.Phan_B.B1;

public class BieuThucDecorator extends BieuThuc {
    BieuThuc bieuThuc;

    public BieuThucDecorator(BieuThuc bieuThuc) {
        this.bieuThuc = bieuThuc;
    }

    @Override
    public String bieuThuc() {
        return bieuThuc.bieuThuc();
    }

    @Override
    public float giaTri() {
        return bieuThuc.giaTri();
    }
}
