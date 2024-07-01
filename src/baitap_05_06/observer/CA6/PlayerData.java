package baitap_05_06.observer.CA6;

public class PlayerData {
    IListenerObserver observers;
    int thoigian, luotchoi, diem;

    public PlayerData(int thoigian, int luotchoi, int diem) {
        this.thoigian = thoigian;
        this.luotchoi = luotchoi;
        this.diem = diem;
    }

    public void attach(IListenerObserver observer) {
        if(observers == null) observers = observer;
    }

    public int getThoigian() {
        return thoigian;
    }

    public void setThoigian(int thoigian) {
        this.thoigian = thoigian;
        observers.listen(this);
    }

    public int getLuotchoi() {
        return luotchoi;
    }

    public void setLuotchoi(int luotchoi) {
        this.luotchoi = luotchoi;
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