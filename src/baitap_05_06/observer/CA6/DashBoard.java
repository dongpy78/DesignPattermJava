package baitap_05_06.observer.CA6;

public class DashBoard implements IListenerObserver {
    @Override
    public void listen(PlayerData data) {
        System.out.println("Update data: ");
        System.out.println("Thoi gian : " + data.getThoigian());
        System.out.println("Luot choi : " + data.getLuotchoi());
        System.out.println("Diem : " + data.getDiem());
    }
}


