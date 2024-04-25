package Behavioral_Patterm.Observer.Bai_1;

public class NhaDauTuA implements TiGiaObserver {
    TiGia t;

    public NhaDauTuA(TiGia t) {
        this.t = t;
    }

    public void dangKy() {
        t.attach(this);
    }

    public void huyDangKy() {
        t.detach(this);
    }

    @Override
    public void update(float delta) {
        if(delta >= 0)  System.out.println("Nha dau tu A: Bans ra ");
        else System.out.println("Nha dau tu A: Mua vao");
    }
}
