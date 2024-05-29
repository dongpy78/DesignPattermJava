package test_13_05_2024.observer.CA6;

public class Dashboard implements IListenerObserver{
    @Override
    public void listen(PlayerData data) {
        System.out.println("Update Data: ");
        System.out.println("thoi gian: " + data.getThoi_gian());
        System.out.println("luot choi: " + data.getSo_luot_choi());
        System.out.println("diem: " + data.getDiem());
    }
}
