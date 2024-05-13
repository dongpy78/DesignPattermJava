package bai_tap.observer.CA6;


public class Dashboard implements IListenerPlayerData{
    @Override
    public void listen(PlayerData data) {
        System.out.println("Cập nhật với dữ liệu mới: ");
        System.out.println("Thời gian: " + data.getThoiGian());
        System.out.println("Số lượt chơi: " + data.getLuotChoi());
        System.out.println("Điểm: " + data.getDiem());
    }
}
