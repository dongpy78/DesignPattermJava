package bai_tap.observer.CA6;

public class Main {
    public static void main(String[] args) {
        Dashboard dashboard = new Dashboard();
        PlayerData playerData = new PlayerData(60, 60, 60);
        playerData.attach(dashboard);
        dashboard.listen(playerData);
        playerData.setDiem(10);
        playerData.setThoiGian(2);
    }
}