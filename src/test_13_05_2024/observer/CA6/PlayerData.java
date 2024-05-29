package test_13_05_2024.observer.CA6;

public class PlayerData {
    IListenerObserver observers;

    int thoi_gian, so_luot_choi, diem;

    public void attach(IListenerObserver observer) {
        if(observers == null) observers = observer;
    }

    public PlayerData(int thoi_gian, int so_luot_choi, int diem) {
        this.thoi_gian = thoi_gian;
        this.so_luot_choi = so_luot_choi;
        this.diem = diem;
    }

    public int getThoi_gian() {
        return thoi_gian;
    }

    public void setThoi_gian(int thoi_gian) {
        this.thoi_gian = thoi_gian;
        observers.listen(this);
    }

    public int getSo_luot_choi() {
        return so_luot_choi;
    }

    public void setSo_luot_choi(int so_luot_choi) {
        this.so_luot_choi = so_luot_choi;
        observers.listen(this);
    }

    public int getDiem() {
        return diem;
    }

    public void setDiem(int diem) {
        this.diem = diem;
        observers.listen(this);
    }
}
