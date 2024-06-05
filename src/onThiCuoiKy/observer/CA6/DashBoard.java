package onThiCuoiKy.observer.CA6;

public class DashBoard implements IListenerObserver {
    @Override
    public void listen(PlayerData data) {
        System.out.println("Update Data!");
        System.out.println("Thời gian: " + data.getThoigian());
        System.out.println("Lượt chơi: " + data.getLuotchoi());
        System.out.println("Điểm: " + data.getDiem());
    }
}
