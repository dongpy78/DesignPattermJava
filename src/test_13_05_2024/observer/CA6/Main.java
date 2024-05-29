package test_13_05_2024.observer.CA6;

public class Main {
    public static void main(String[] args) {
        Dashboard dashboard = new Dashboard();
        PlayerData playerData = new PlayerData(1, 2, 3);
        playerData.attach(dashboard);
        dashboard.listen(playerData);
        playerData.setDiem(10);
    }
}
