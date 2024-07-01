package baitap_05_06.observer.CA6;

public class Main {
    public static void main(String[] args) {
        DashBoard dashBoard = new DashBoard();
        PlayerData playerData = new PlayerData(10, 20, 30);
        playerData.attach(dashBoard);
        dashBoard.listen(playerData);
        playerData.setDiem(1);
    }
}
