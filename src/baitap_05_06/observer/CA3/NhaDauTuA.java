package baitap_05_06.observer.CA3;

public class NhaDauTuA implements TiGiaObserver{
    public void attach(TiGia t) {
        t.attach(this);
    }

    public void detach(TiGia t) {
        t.detach(this);
    }
    @Override
    public void update(float delta) {
        if(delta >= 0)
            System.out.println("Nhà đầu tư A mua vào!");
        else System.out.println("Nhà đầu tư A bán ra!");
    }
}
