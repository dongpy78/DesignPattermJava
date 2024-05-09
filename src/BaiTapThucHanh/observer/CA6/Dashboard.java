package BaiTapThucHanh.observer.CA6;

public class Dashboard implements PlayerDataListener {

    @Override
    public void listen(PlayerData data) {
        System.out.println("Dashboard is updating with new data:");
        System.out.println(" - Thoi Gian: " + data.getThoiGian());
        System.out.println(" - So Luot Choi: " + data.getSoLuotChoi());
        System.out.println(" - Diem: " + data.getDiem());
    }
}
