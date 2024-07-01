package baitap_05_06.observer.CA3;

public class NhaDauTuB implements TiGiaObserver{
    public void attach(TiGia t) {
        t.attach(this);
    }

    public void detach(TiGia t) {
        t.detach(this);
    }
    @Override
    public void update(float delta) {
        if(delta >= 0) System.out.println("Nhà đầu tư B bán ra!");
        else System.out.println("Nhà đầu tư B mua vào");
    }
}
